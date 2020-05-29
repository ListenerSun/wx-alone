package com.sqt.edu.config;


import com.sqt.edu.api.common.entity.SysDicData;
import com.sqt.edu.api.common.entity.SysDicType;
import com.sqt.edu.api.common.mapper.SysDicDataMapper;
import com.sqt.edu.api.common.mapper.SysDicTypeMapper;
import com.sqt.edu.constant.CacheConstants;
import com.sqt.edu.utils.RedisHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 字典初始化 缓存 配置
 *
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-13 9:39
 */
@Slf4j
@Configuration
public class InitConfiguration implements InitializingBean {

    @Autowired
    private SysDicTypeMapper sysDicTypeMapper;
    @Autowired
    private SysDicDataMapper sysDicDataMapper;
    @Autowired
    private RedisHelper redisHelper;

    @Override
    public void afterPropertiesSet() {
        SysDicInit();

    }

    /**
     * 字典缓存初始化
     */
    public void SysDicInit() {
        log.info("==========>字典缓存初始化开始");
        List<SysDicType> sysDicTypeList = sysDicTypeMapper.queryAllDicType();
        if (null != sysDicTypeList && sysDicTypeList.size() != 0) {
            sysDicTypeList.forEach(e -> {
                List<SysDicData> sysDicDataList = sysDicDataMapper.queryByDicType(e.getCode());
                redisHelper.hdel(CacheConstants.DIC_CACHE, CacheConstants.CACHE_KEY_DEFAULT, e.getCode());
                redisHelper.hset(CacheConstants.DIC_CACHE, CacheConstants.CACHE_KEY_DEFAULT, e.getCode(), sysDicDataList);
            });
        }
        log.info("==========>字典初始化完毕");
    }
}

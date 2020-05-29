package com.sqt.edu.api.common.service;


import com.sqt.edu.base.JsonResult;
import com.sqt.edu.config.InitConfiguration;
import com.sqt.edu.constant.CacheConstants;
import com.sqt.edu.utils.RedisHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-13 9:16
 */
@Service
@Slf4j
public class CommonService {

    @Autowired
    private RedisHelper redisHelper;
    @Autowired
    private InitConfiguration initConfiguration;

    public JsonResult getAllDic() {
        Map<String, Object> dicMap = redisHelper.hgetAll(CacheConstants.DIC_CACHE, CacheConstants.CACHE_KEY_DEFAULT);
        if (null == dicMap) {
            initConfiguration.SysDicInit();
        }
        dicMap = redisHelper.hgetAll(CacheConstants.DIC_CACHE, CacheConstants.CACHE_KEY_DEFAULT);
        return new JsonResult(dicMap);
    }
}

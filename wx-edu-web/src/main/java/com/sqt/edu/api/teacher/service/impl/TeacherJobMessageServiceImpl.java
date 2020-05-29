package com.sqt.edu.api.teacher.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sqt.edu.api.teacher.mapper.TeacherInfoMapper;
import com.sqt.edu.api.teacher.mapper.TeacherJobMessageMapper;
import com.sqt.edu.api.teacher.service.TeacherJobMessageService;
import com.sqt.edu.base.JsonResult;
import com.sqt.edu.base.JsonResultHandler;
import com.sqt.edu.base.PageResult;
import com.sqt.edu.base.ResultCode;
import com.sqt.edu.entity.TeacherInfo;
import com.sqt.edu.entity.TeacherJobMessage;
import com.sqt.edu.exception.ServiceException;
import com.sqt.edu.request.TeacherJobMessageDTO;
import com.sqt.edu.response.TeacherJobMessageVO;
import com.sqt.edu.utils.PageEduHelper;
import com.sqt.edu.utils.RequestHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-01-03 19:27
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class TeacherJobMessageServiceImpl implements TeacherJobMessageService {

    @Autowired
    private TeacherJobMessageMapper teacherJobMessageMapper;

    @Override
    public JsonResult listTeacherJobMessage(int pageSize, int pageNum) {
        PageResult<TeacherJobMessageVO> teacherJobMessagePageResult = PageEduHelper.selectPageResult(pageSize, pageNum, () -> teacherJobMessageMapper.listTeacherJobMessage());
        return JsonResultHandler.success(teacherJobMessagePageResult);
    }

}

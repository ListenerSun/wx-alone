package com.sqt.edu.api.account.service;

import com.sqt.edu.base.JsonResult;
import com.sqt.edu.request.AccUserRealNameDTO;
import com.sqt.edu.request.TeacherInfoDTO;

/**
 * @Description: 实名认证
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-30 20:04
 */
public interface AccUserRealNameService {

    /**实名认证
     * @param accUserRealNameDTO
     * @return
     */
    JsonResult realName(AccUserRealNameDTO accUserRealNameDTO);

    /**
     *校验用户是否已认证
     * @param userId
     * @return
     */
    JsonResult authRealName(Long userId);

    /** 认证普通老师
     * @param teacherInfoDTO
     * @return
     */
    JsonResult authNormalTeacher(TeacherInfoDTO teacherInfoDTO);
}

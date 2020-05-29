package com.sqt.edu.api.teacher.service;

import com.sqt.edu.base.JsonResult;
import com.sqt.edu.request.TeacherInfoDTO;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-24 18:22
 */
public interface TeacherService {

    /** add a teacher info
     * @param teacherInfoDTO
     * @return
     */
    JsonResult add(TeacherInfoDTO teacherInfoDTO);

    /**根据用户id 查询老师信息
     * @param accUserId
     * @return
     */
    JsonResult getTeacherInfoByAccUserId(Long accUserId);
}

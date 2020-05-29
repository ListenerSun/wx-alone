package com.sqt.edu.api.teacher.service;

import com.sqt.edu.base.JsonResult;
import com.sqt.edu.request.TeacherJobMessageDTO;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date:  Created in 2020-01-03 19:27
 */
public interface TeacherJobMessageService {


    /**分页查询 家教信息列表
     * @param pageSize
     * @param pageNum
     * @return
     */
    JsonResult listTeacherJobMessage(int pageSize, int pageNum);


}

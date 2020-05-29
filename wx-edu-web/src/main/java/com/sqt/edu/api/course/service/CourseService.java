package com.sqt.edu.api.course.service;

import com.sqt.edu.base.JsonResult;
import com.sqt.edu.request.CourseDTO;

import java.util.List;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-01-13 14:41
 */
public interface CourseService {


    /**查询推荐课程
     * @return
     */
    JsonResult listDiscoverCourses();

}

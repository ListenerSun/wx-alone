package com.sqt.edu.api.course.service.impl;


import com.sqt.edu.api.course.mapper.CourseMapper;
import com.sqt.edu.api.course.service.CourseService;
import com.sqt.edu.api.teacher.service.TeacherService;
import com.sqt.edu.base.JsonResult;
import com.sqt.edu.base.JsonResultHandler;
import com.sqt.edu.response.DiscoverCourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-01-13 14:48
 */
@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public JsonResult listDiscoverCourses() {
        List<DiscoverCourseVo> discoverCourseList = courseMapper.listDiscoverCourses();
        return JsonResultHandler.success(discoverCourseList);
    }

}

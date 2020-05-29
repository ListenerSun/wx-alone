package com.sqt.edu.api.course.controller;

import com.sqt.edu.api.course.service.CourseService;
import com.sqt.edu.base.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-01-13 14:10
 */
@Api(tags = "【课程相关APi】")
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/discover")
    @ApiOperation(value = "C-10-查询推荐课程")
    public JsonResult listDiscoverCourses() {
        return courseService.listDiscoverCourses();
    }

}

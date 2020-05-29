package com.sqt.edu.api.teacher.controller;

import com.sqt.edu.api.teacher.service.TeacherService;
import com.sqt.edu.base.JsonResult;
import com.sqt.edu.request.TeacherInfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-24 18:18
 */
@Api(tags = "【老师个人信息接口】")
@RestController
@RequestMapping("/teacher/edu/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "Teacher-1.1-添加一个老师信息")
    @PostMapping("/auth_teacher")
    public JsonResult add(@RequestBody @Valid TeacherInfoDTO teacherInfoDTO){
        return teacherService.add(teacherInfoDTO);
    }

    @ApiOperation(value = "Teacher-1.2-根据acc_user_id查询老师信息")
    @GetMapping("info_by_acc_user_id")
    public JsonResult getTeacherInfoByAccUserId(@RequestParam Long accUserId){
        return teacherService.getTeacherInfoByAccUserId(accUserId);
    }

}

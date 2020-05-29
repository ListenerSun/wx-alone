package com.sqt.edu.api.teacher.controller;

import com.sqt.edu.api.teacher.service.TeacherJobMessageService;
import com.sqt.edu.base.JsonResult;
import com.sqt.edu.request.TeacherJobMessageDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-01-03 16:52
 */
@RestController
@Api(tags = "【老师发布家教信息相关接口】")
@RequestMapping("/teacher/edu/teacher_job")
public class TeacherJobMessageController {

    @Autowired
    private TeacherJobMessageService teacherJobMessageService;

    /**********************************************用户端需要的接口******************************/

    @ApiOperation(value = "TeacherMessageJob-C-1-1查询所有贴心老师列表")
    @GetMapping("/list_teacher_job_message")
    public JsonResult listTeacherJobMessage(@RequestParam int pageSize, @RequestParam int pageNum){
        return teacherJobMessageService.listTeacherJobMessage(pageSize,pageNum);
    }

}

package com.sqt.edu.api.account.controller;

import com.sqt.edu.api.account.service.AccUserRealNameService;
import com.sqt.edu.base.JsonResult;
import com.sqt.edu.request.AccUserRealNameDTO;
import com.sqt.edu.request.TeacherInfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-30 20:01
 */
@Slf4j
@Api(tags = "【用户实名认证相关接口】")
@RestController
@RequestMapping("/account/realname")
public class AccUserRealNameController {

    @Autowired
    private AccUserRealNameService accUserRealNameService;

    @ApiOperation(value = "R-1-实名认证")
    @PostMapping("/acc_user")
    public JsonResult realName(@RequestBody @Valid AccUserRealNameDTO accUserRealNameDTO) {
        return accUserRealNameService.realName(accUserRealNameDTO);
    }

    @ApiOperation(value = "R-2-校验用户是否实名认证")
    @GetMapping("/acc_real_name")
    public JsonResult authRealName(@NotNull @RequestParam Long userId) {
        return accUserRealNameService.authRealName(userId);
    }

    @ApiOperation(value = "R-2-认证为普通老师")
    @PostMapping("/acc_normal_teacher")
    public JsonResult authNormalTeacher(@NotNull @RequestBody TeacherInfoDTO teacherInfoDTO) {
        return accUserRealNameService.authNormalTeacher(teacherInfoDTO);
    }
}

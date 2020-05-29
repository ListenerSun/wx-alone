package com.sqt.edu.api.account.controller;

import com.sqt.edu.api.account.service.AccUserService;
import com.sqt.edu.base.BaseLoginParam;
import com.sqt.edu.base.JsonResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-17 11:09
 */
@Api(tags = "【登入相关接口】")
@RequestMapping("/account/login")
@RestController
public class LoginController{

    @Autowired
    private AccUserService accUserService;

    @PostMapping("/login-by-password")
    public JsonResult loginByPassword(BaseLoginParam baseLoginParam) {
        return accUserService.loginByPassword(baseLoginParam);
    }
}

package com.sqt.edu.api.account.service;

import com.sqt.edu.base.BaseLoginParam;
import com.sqt.edu.base.JsonResult;
import com.sqt.edu.request.AccUserInfoDTO;
import com.sqt.edu.request.RegisterUserDTO;
import com.sqt.edu.request.UpdatePasswordDTO;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-16 14:40
 */
public interface AccUserService {

    /**create a AccUser
     * @param registerUserDTO
     * @return
     */
    AccUserInfoDTO create(RegisterUserDTO registerUserDTO);

    /**注册用户发送 验证码
     * @param phone
     */
    void sendRegisterCode(String phone);

    /**根据 用户名 密码 登入
     * @param baseLoginParam
     * @return
     */
    JsonResult loginByPassword(BaseLoginParam baseLoginParam);

    /**update password
     * @param updatePasswordDTO
     * @return
     */
    JsonResult updatePassword(UpdatePasswordDTO updatePasswordDTO);
}

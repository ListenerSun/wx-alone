package com.sqt.edu.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-16 17:46
 */
public final class AccountEnum {

    /**
     * 用户认证状态
     */
    @AllArgsConstructor
    @Getter
    public enum AccUserAuthState {
        NOT_AUTH("1", "未认证"),
        AUTH_ING("2", "认证中"),
        AUTH_SUCCESS("3", "已认证"),
        AUTH_FAIL("4", "认证失败");
        private String code;
        private String value;

    }

    /**
     * 用户账号 可用状态
     */
    @AllArgsConstructor
    @Getter
    public enum AccUserState {
        IN_USE("1", "启用"),
        NOT_USE("0", "禁用");
        private String code;
        private String value;
    }

    /**
     * 用户类型
     */
    @AllArgsConstructor
    @Getter
    public enum AccUserType {
        ADMIN_USER("0", "管理员"),
        NORMAL_TEACHER_USER("1", "普通老师"),
        PROFESSIONAl_TEACHER_USER("2", "专业讲师"),
        NORMAL_USER("3", "普通用户");
        private String code;
        private String value;
    }
}

package com.qqq.usercenter.contant;

/**
 * @author qqq
 * @description 用户常量
 * @createDate 2023/6/21 16:16
 */
public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "userLoginState";

    // ------- 权限 -------
    /**
     * 默认权限
     */
    int DEFAULT_ROLE = 0;
    /**
     * 管理员权限
     */
    int ADMIN_ROLE = 1;
    /**
     * 账号最小值
     */
    int ACCOUNT_MIN = 3;
    /**
     * 密码最小值
     */
    int PASSWORD_MIN = 3;
}

package com.qqq.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qqq
 * @description 用户登录请求体
 * @createDate 2023/6/20 23:46
 */
@Data
public class UserLoginRequest implements Serializable{


    private static final long serialVersionUID = -2117662868844301896L;

    private String userAccount;

    private String userPassword;

}

package com.qqq.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qqq
 * @description 用户注册请求体
 * @createDate 2023/6/20 23:46
 */
@Data
public class UserRegisterRequest implements Serializable{


    private static final long serialVersionUID = -9128710085787272410L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

}

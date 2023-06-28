package com.qqq.usercenter.exception;

/**
 * @author qqq
 * @description
 * @createDate 2023/6/25 18:44
 */

import com.qqq.usercenter.common.ErrorCode;

/**
 * 自定义异常类
 *
 */
public class BusinessException extends RuntimeException {

    private final int codee;

    private final String description;

    public BusinessException(String message, int codee, String description) {
        super(message);
        this.codee = codee;
        this.description = description;
    }
    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.codee = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode,String description) {
        super(errorCode.getMessage());
        this.codee = errorCode.getCode();
        this.description = description;
    }

    public int getCodee() {
        return codee;
    }

    public String getDescription() {
        return description;
    }
}

package com.yzb.site.common;

public enum CodeEnum {
    SUCCESS(1,"成功"),
    FAIL(0,"失败"),
    ;

    private final Integer code;
    private final String message;

    CodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getcode() {
        return code;
    }

//    public void setcode(Integer code) {
//        this.code = code;
//    }

    public String getMessage() {
        return message;
    }

//    public void setMessage(String message) {
//        this.message = message;
//    }
}

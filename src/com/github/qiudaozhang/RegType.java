package com.github.qiudaozhang;

import java.util.Arrays;

/**
 * @author 邱道长
 * 2021/1/11
 */
public enum RegType {

    REG_PHONE(1,"手机注册"),
    REG_EMAIL(2,"邮箱注册");

    private int code;

    private String value;

    RegType(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static RegType codeInstance(int code) {
        RegType[] values = RegType.values();
//        RegType t = Arrays.stream(values).filter(c -> c.code == code).
//                findFirst().orElseThrow(() -> new RuntimeException("非法"));
        RegType t = Arrays.stream(values).filter(c -> c.code == code).
                findFirst().orElseThrow(() -> new EnumException(EnumException.EnumError.ENUM_ERROR));
        return t;
    }
}

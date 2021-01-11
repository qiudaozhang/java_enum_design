package com.github.qiudaozhang;

/**
 * @author 邱道长
 * 2021/1/11
 */
public class EnumException  extends RuntimeException{


    private EnumError enumError;

    public EnumError getEnumError() {
        return enumError;
    }


    public EnumException(EnumError enumError) {
        super(enumError.getCode() + ":" + enumError.getMsg());
    }

    public void setEnumError(EnumError enumError) {
        this.enumError = enumError;
    }

    public static enum EnumError {

        ENUM_ERROR(100001,"枚举码不存在"),
        ;
        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        EnumError(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }
}

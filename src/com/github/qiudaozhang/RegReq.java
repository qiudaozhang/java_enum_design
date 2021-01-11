package com.github.qiudaozhang;

/**
 * @author 邱道长
 * 2021/1/11
 */
public class RegReq {


    private Integer regType;

    private String value;

    private String callingCode;

    public Integer getRegType() {
        return regType;
    }

    public void setRegType(Integer regType) {
        this.regType = regType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }
}

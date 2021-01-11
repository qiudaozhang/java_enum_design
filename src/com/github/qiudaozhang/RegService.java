package com.github.qiudaozhang;

/**
 * @author 邱道长
 * 2021/1/11
 */
public class RegService {

    public void register(RegReq regReq) {
        RegType regType = RegType.codeInstance(regReq.getRegType());

        switch (regType) {
            case REG_PHONE:
                // 你的业务
                break;
            case REG_EMAIL:
                // 你的业务
                break;
        }
    }
}

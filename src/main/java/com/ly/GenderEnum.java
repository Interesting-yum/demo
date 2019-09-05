package com.ly;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author ly
 * @time 2019/9/5  0:33
 * @description TODO
 */
@Slf4j
@Getter
@AllArgsConstructor
public enum GenderEnum {
    MAN(1,"男"),
    MOVEN(0,"女");
    private Integer gender;
    private String desc;

    public static String getDescByName(Integer gender){
        if(Objects.isNull(gender)){
            log.warn("value is null! ->{}",gender);
            return "";
        }
        switch (gender){
            case 1:
                return MAN.getDesc();
            case 0:
                return MOVEN.getDesc();
            default:
                return "";
        }
    }
}

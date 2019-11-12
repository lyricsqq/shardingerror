package com.lyrics.qq.shardingerror.commonenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * 删除状态码
 */
@Getter
public enum StatusEnum {
    DELETE(0,"删除"),  //删除
    NORMAL(1,"正常");  //正常
    @EnumValue
    private Integer value;
    private String des;

    StatusEnum(Integer value, String des) {
        this.value = value;
        this.des = des;
    }
}

package com.lyrics.qq.shardingerror.commonenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AssertEnum {
    YES(1, "是"),
    NO(0, "否");
    @EnumValue
    private Integer value;
    private String des;
}

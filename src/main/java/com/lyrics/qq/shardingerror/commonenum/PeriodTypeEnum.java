package com.lyrics.qq.shardingerror.commonenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PeriodTypeEnum {
    ONE(1, "一天一检"),
    TWO(2, "一天两检"),
    THREE(3, "一天三检"),
    SEVEN(7, "一周一检"),
    FIFTEEN(15, "半月一检"),
    THIRTY(30, "一月一检"),
    NINETY(90, "每季度一检"),
    ONEHUNDREDEIGHTY(180, "半年一检"),
    THREEHUNDREDANDSIXTY(360, "一年一检");

    @EnumValue
    private Integer value;
    private String des;
}

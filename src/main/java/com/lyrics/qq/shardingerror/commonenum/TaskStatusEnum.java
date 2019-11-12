package com.lyrics.qq.shardingerror.commonenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 任务执行状态
 */
@Getter
@AllArgsConstructor
public enum TaskStatusEnum {
    ABNORMAL(0, "异常"),
    NORMAL(2, "正常"),
    NOCHECK(1, "未检"),
    DOWN(3, "停机未检");

    @EnumValue
    private Integer value;
    private String des;
}

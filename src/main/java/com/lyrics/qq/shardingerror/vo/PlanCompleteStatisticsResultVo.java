package com.lyrics.qq.shardingerror.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlanCompleteStatisticsResultVo {
    @ApiModelProperty(value = "总条数")
    private String allCount;
    @ApiModelProperty(value = "异常数量")
    private Integer abnormalCount;
    @ApiModelProperty(value = "未检数量")
    private Integer undetectedCount;
    @ApiModelProperty(value = "正常数量")
    private Integer normalCount;
    @ApiModelProperty(value = "停机未检数量")
    private Integer haltCount;
    @ApiModelProperty(value = "计划id")
    private Integer planId;
    @ApiModelProperty(value = "计划名字")
    private String planName;
}

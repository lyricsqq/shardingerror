package com.lyrics.qq.shardingerror.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class PlanUserStatisticsResultVo {
    @ApiModelProperty(value = "总点检任务数")
    private Integer allCount;
    @ApiModelProperty(value = "异常数")
    private Integer abnormalCount;
    @ApiModelProperty(value = "未检数")
    private Integer undetectedCount;
    @ApiModelProperty(value = "正常数")
    private Integer normalCount;
    @ApiModelProperty(value = "停机未检数")
    private Integer haltCount;
    @ApiModelProperty(value = "用户id")
    private Integer userId;
    @ApiModelProperty(value = "用户名")
    private String userName;
}

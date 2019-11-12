package com.lyrics.qq.shardingerror.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel
@Getter
@Setter
public class PlanSectorStatisticsResultVo {
    @ApiModelProperty(value = "异常数量")
    private Integer abnormalCount;
    @ApiModelProperty(value = "未检数量")
    private Integer undetectedCount;
    @ApiModelProperty(value = "正常数量")
    private Integer normalCount;
    @ApiModelProperty(value = "停机未检数量")
    private Integer haltCount;
    @ApiModelProperty(value = "点检设备总数")
    private Integer devCount;
}

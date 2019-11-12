package com.lyrics.qq.shardingerror.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class PlanDevAbnormalStatisticsResultVo {
    @ApiModelProperty(value = "异常数量")
    private Integer abnormalCount;
    @ApiModelProperty(value = "设备id")
    private Integer devId;
    @ApiModelProperty(value = "设备编号")
    private String sn;
    @ApiModelProperty(value = "设备名称")
    private String devName;
}

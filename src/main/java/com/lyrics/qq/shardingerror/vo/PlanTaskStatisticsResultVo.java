package com.lyrics.qq.shardingerror.vo;

import com.lyrics.qq.shardingerror.commonenum.TaskStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class PlanTaskStatisticsResultVo {
    @ApiModelProperty(value = "设备id")
    private Integer devId;
    @ApiModelProperty(value = "点检项目")
    private String item;
    @ApiModelProperty(value = "点检人")
    private Integer submitUserId;
    @ApiModelProperty(value = "任务状态")
    private TaskStatusEnum taskStatus;
    @ApiModelProperty(value = "点检周期")
    private String workTime;
    @ApiModelProperty(value = "设备名称")
    private String devName;
    @ApiModelProperty(value = "提交人")
    private String submitName;
}

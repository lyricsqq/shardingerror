package com.lyrics.qq.shardingerror.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@ApiModel
public class InquiryBaseVo {




    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间 eg format yyyy-MM-dd",required = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;
    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间 eg format yyyy-MM-dd",required = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;
}

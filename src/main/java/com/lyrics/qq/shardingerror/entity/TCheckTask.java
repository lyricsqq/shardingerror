package com.lyrics.qq.shardingerror.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lyrics.qq.shardingerror.commonenum.AssertEnum;
import com.lyrics.qq.shardingerror.commonenum.PeriodTypeEnum;
import com.lyrics.qq.shardingerror.commonenum.TaskStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 点检任务表
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel
public class TCheckTask extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer orgId;

    /**
     * 计划名称
     */
    @ApiModelProperty(value = "计划名称")
    private String plan;

    @ApiModelProperty(value = "")
    private Integer planId;

    /**
     * 异常名称
     */
    @ApiModelProperty(value = "异常名称")
    private String defect;

    @ApiModelProperty(value = "")
    private Integer defectId;

    /**
     * 设备名
     */
    @ApiModelProperty(value = "设备名")
    private String dev;

    @ApiModelProperty(value = "")
    private Integer devId;

    /**
     * 维护项
     */
    @ApiModelProperty(value = "维护项")
    private String item;

    /**
     * 点检项ID
     */
    @ApiModelProperty(value = "点检项ID")
    private Integer itemId;

    /**
     * 点检人员ID列表
     */
    @ApiModelProperty(value = "点检人员ID列表")
    private String userIds;

    /**
     * 完成人ID
     */
    @ApiModelProperty(value = "完成人ID")
    private Integer submitUserId;

    /**
     * 班次：早班、中班、晚班，每天，每周，每月，半年
     */
    @ApiModelProperty(value = "班次：早班、中班、晚班，每天，每周，每月，半年")
    private String classes;

    /**
     * 排序级别
     */
    @ApiModelProperty(value = "排序级别")
    private String level;

    /**
     * 时间戳
     * 年月日20170512
     * 年周2017w23
     * 年月201702
     * 年季2017s0 第一季度 2017s1第一季度
     * 上半年2017hy0
     * 下半年2017hy1
     */
    @ApiModelProperty(value = "时间戳\n" +
            "     * 年月日20170512\n" +
            "     * 年周2017w23\n" +
            "     * 年月201702\n" +
            "     * 年季2017s0 第一季度 2017s1第一季度\n" +
            "     * 上半年2017hy0\n" +
            "     * 下半年2017hy1")
    private String dateYmd;

    /**
     * 提交时间
     */
    @ApiModelProperty(value = "提交时间")
    private Date submitTime;

    /**
     * 拍摄照图片
     */
    @ApiModelProperty(value = "拍摄照图片")
    private Integer img;

    /**
     * 任务执行状态：0异常|2正常|1未检|3停机未检
     */
    @ApiModelProperty(value = "任务执行状态：0异常|2正常|1未检|3停机未检 ABNORMAL(0, \"异常\"),\n" +
            "    NORMAL(2, \"正常\"),\n" +
            "    NOCHECK(1, \"未检\"),\n" +
            "    DOWN(3, \"停机未检\");")
    private TaskStatusEnum taskStatus;

    /**
     * 范围值上限
     */
    @ApiModelProperty(value = "范围值上限")
    private Double rangeMax;

    /**
     * 范围值下限
     */
    @ApiModelProperty(value = "范围值下限")
    private Double rangeMin;

    /**
     * 是否抄表1:需要抄表0:不需要抄表
     */
    @ApiModelProperty(value = "是否抄表1:需要抄表0:不需要抄表")
    private AssertEnum isCopy;

    /**
     * 异常报送组的Id
     */
    @ApiModelProperty(value = "异常报送组的Id")
    private Integer deptId;

    /**
     * 记录值
     */
    @ApiModelProperty(value = "")
    private Double record;

    /**
     * 过期时间
     */
    @ApiModelProperty(value = "过期时间")
    private Date expiryTime;

    /**
     * 早班8:00-12:00,每周周三 用于显示任务工作时间段
     */
    @ApiModelProperty(value = "早班8:00-12:00,每周周三 用于显示任务工作时间段")
    private String workTime;

    /**
     * 定时任务推送执行时间
     */
    @ApiModelProperty(value = "定时任务推送执行时间")
    private Date executeTime;

    /**
     * 定时任务推送执行时间毫秒数
     */
    @ApiModelProperty(value = "定时任务推送执行时间毫秒数")
    private Long executeMsec;

    /**
     * 基准
     */
    @ApiModelProperty(value = "基准")
    private String base;

    /**
     * 设备地址
     */
    @ApiModelProperty(value = "设备地址")
    private String devAddress;

    /**
     * 类别
     */
    @ApiModelProperty(value = "类别")
    private String categoryName;

    /**
     * 周期
     */
    @ApiModelProperty(value = "周期")
    private PeriodTypeEnum period;

    /**
     * 0 未提醒 ，1 已提醒
     */
    @ApiModelProperty(value = " 0 未提醒 ，1 已提醒")
    private AssertEnum remind;

    @ApiModelProperty(value = "")
    private Integer planDevId;


}

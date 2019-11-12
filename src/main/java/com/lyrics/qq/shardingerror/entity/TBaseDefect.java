package com.lyrics.qq.shardingerror.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lyrics.qq.shardingerror.commonenum.AssertEnum;
import com.lyrics.qq.shardingerror.commonenum.OperateStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 报修(缺陷)单表
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel
public class TBaseDefect extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "")
    private String mId;

    /**
     * 组织机构ID
     */
    @ApiModelProperty(value = "组织机构ID")
    private Integer orgId;

    /**
     * 报修、巡检、点检、告警
     */
    @ApiModelProperty(value = "报修、巡检、点检、告警")
    private Integer categoryId;

    /**
     * 对应设备ID
     */
    @ApiModelProperty(value = "对应设备ID")
    private Integer devId;
    @ApiModelProperty(value = "")
    private String dev;

    /**
     * -1所有0@All
     */
    @ApiModelProperty(value = "-1所有0@All")
    private Integer deptId;

    /**
     * 大坐标位置
     */
    @ApiModelProperty(value = "大坐标位置")
    private String loc;

    /**
     * 二级具体坐标位置
     */
    @ApiModelProperty(value = "二级具体坐标位置")
    private String subLoc;

    /**
     * 报修设备编号
     */
    @ApiModelProperty(value = "报修设备编号")
    private String sn;

    /**
     * 问题描述
     */
    @ApiModelProperty(value = "问题描述")
    private String cmt;

    /**
     * 报修语音String[]
     */
    @ApiModelProperty(value = "报修语音")
    private String vocs;

    /**
     * 报修图片说明String[]
     */
    @ApiModelProperty(value = "报修图片说明")
    private String imgs;

    /**
     * yym+流水号(同一个企业账号唯一)
     */
    @ApiModelProperty(value = "yym+流水号(同一个企业账号唯一)")
    private String rfn;

    /**
     * 微信报修标志
     */
    @ApiModelProperty(value = "微信报修标志")
    private AssertEnum wx;

    /**
     * 是否置顶1是0否
     */
    @ApiModelProperty(value = "是否置顶1是0否")
    private AssertEnum isTop;

    /**
     * 置顶日期
     */
    @ApiModelProperty(value = "置顶日期")
    private Date tt;

    /**
     * 是否在看板上显示 默认1显示0不显示
     */
    @ApiModelProperty(value = "是否在看板上显示 默认1显示0不显示")
    private AssertEnum isBoard;

    /**
     * 是否加急处理默认0不加急1加急
     */
    @ApiModelProperty(value = "是否加急处理默认0不加急1加急")
    private AssertEnum urgent;

    /**
     * 10待受理\\\\r\\\\n11已撤销 \\\\r\\\\n12已指派 \\\\r\\\\n13已退回14已收回20已受理\\\\r\\\\n21待确认 \\\\r\\\\n22被拒绝 \\\\r\\\\n23已撤销\\\\r\\\\n30已修好 \\\\r\\\\n31已确认\\\\r\\\\n32 已评论\\\\r\\\\n40已关闭\\\\r\\\\n100已忽略
     */
    @ApiModelProperty(value = "10待受理 11已撤销 12已指派 13已退回14已收回 20已受理 21待确认 22被拒绝 23已撤销 30已修好 31已确认 32 已评论 40已关闭 100已忽略")
    private OperateStatusEnum operateStatus;

    /**
     * 微监测仪表信息
     */
    @ApiModelProperty(value = "微监测仪表信息")
    private String wjcTypeMode;

    /**
     * 修改次数
     */
    @ApiModelProperty(value = "修改次数")
    private Integer modifyCount;

    /**
     * 维保商Id
     */
    @ApiModelProperty(value = "维保商Id")
    private Integer mpId;

    /**
     * 维保商名称
     */
    @ApiModelProperty(value = "维保商名称")
    private String mpName;

    /**
     * 是否外，0否1是
     */
    @ApiModelProperty(value = "是否外，0否1是")
    private AssertEnum isOut;

    /**
     * 外派工单Id
     */
    @ApiModelProperty(value = "外派工单Id")
    private Integer orderId;


}

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

/**
 * <p>
 * 报修单操作日志表
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel
public class TBaseDefectLog extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer defectId;

    /**
     * 操作人ID
     */
    @ApiModelProperty(value = "操作人ID")
    private Integer operaterId;
    @ApiModelProperty(value = "")
    private String operater;

    @ApiModelProperty(value = "")
    private Integer orgId;

    /**
     * 备件库
     * [{pn:'料号',name:'名字', model:'型号', num:'数量'},..]
     */
    @ApiModelProperty(value = "备件库")
    private String parts;

    /**
     * 维修语音String[]
     */
    @ApiModelProperty(value = "维修语音")
    private String vocs;

    /**
     * 维修图片列表
     */
    @ApiModelProperty(value = "维修图片列表")
    private String imgs;

    /**
     * 维修备注内容
     */
    @ApiModelProperty(value = "维修备注内容")
    private String content;

    /**
     * 10待受理
     * 11已撤销
     * 12已指派
     * 13已退回
     * 20已受理
     * 21待确认
     * 22被拒绝
     * 23已撤销
     * 30已修好
     * 31已确认
     * 32 已评论
     * 40已关闭
     * 100已忽略
     */
    @ApiModelProperty(value = "10待受理\n" +
            "     * 11已撤销\n" +
            "     * 12已指派\n" +
            "     * 13已退回\n" +
            "     * 20已受理\n" +
            "     * 21待确认\n" +
            "     * 22被拒绝\n" +
            "     * 23已撤销\n" +
            "     * 30已修好\n" +
            "     * 31已确认\n" +
            "     * 32 已评论\n" +
            "     * 40已关闭\n" +
            "     * 100已忽略")
    private OperateStatusEnum operateStatus;

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

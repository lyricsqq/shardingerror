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
 * 报修单操作最新记录表
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel
public class TBaseDefectOperate extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer defectId;

    @ApiModelProperty(value = "")
    private Integer orgId;

    /**
     * 报修人ID
     */
    @ApiModelProperty(value = "报修人ID")
    private Integer bxUserId;

    @ApiModelProperty(value = "")
    private String bxUserName;

    @ApiModelProperty(value = "")
    private Date bxTime;

    /**
     * 被指派人ID
     */
    @ApiModelProperty(value = "被指派人ID")
    private Integer assignUserId;

    @ApiModelProperty(value = "")
    private String assignUserName;

    @ApiModelProperty(value = "")
    private Date assignTime;

    @ApiModelProperty(value = "")
    private String assignCmt;

    /**
     * 退回人ID
     */
    @ApiModelProperty(value = "退回人ID")
    private Integer sendBackUserId;

    @ApiModelProperty(value = "")
    private String sendBackUserName;

    @ApiModelProperty(value = "")
    private Date sendBackTime;

    @ApiModelProperty(value = "")
    private String sendBackCmt;

    /**
     * 受理人ID
     */
    @ApiModelProperty(value = "受理人ID")
    private Integer acceptUserId;

    @ApiModelProperty(value = "")
    private String acceptUserName;

    @ApiModelProperty(value = "")
    private Date acceptTime;

    /**
     * 完成人ID
     */
    @ApiModelProperty(value = "完成人ID")
    private Integer finishUserId;

    @ApiModelProperty(value = "")
    private String finishUserName;

    @ApiModelProperty(value = "")
    private Date finishTime;

    @ApiModelProperty(value = "")
    private String finishCmt;

    /**
     * 备件库\\\\r\\\\n[{pn:'料号',name:'名字', model:'型号', num:'数量'},..]
     */
    @ApiModelProperty(value = "备件库")
    private String finishParts;

    /**
     * 新报修撤销人ID
     */
    @ApiModelProperty(value = "新报修撤销人ID")
    private Integer newCancelUserId;

    @ApiModelProperty(value = "")
    private String newCancelUserName;

    @ApiModelProperty(value = "")
    private Date newCancelTime;

    @ApiModelProperty(value = "")
    private String newCancelCmt;

    /**
     * 已受理撤销人ID
     */
    @ApiModelProperty(value = "已受理撤销人ID")
    private Integer acceptCancelUserId;

    @ApiModelProperty(value = "")
    private String acceptCancelUserName;

    @ApiModelProperty(value = "")
    private Date acceptCancelTime;

    @ApiModelProperty(value = "")
    private String acceptCancelCmt;

    /**
     * 确认人ID
     */
    @ApiModelProperty(value = "确认人ID")
    private Integer confirmUserId;

    @ApiModelProperty(value = "")
    private String confirmUserName;

    @ApiModelProperty(value = "")
    private Date confirmTime;

    /**
     * 评论人ID
     */
    @ApiModelProperty(value = "评论人ID")
    private Integer commitedUserId;

    @ApiModelProperty(value = "")
    private String commitedUserName;

    @ApiModelProperty(value = "")
    private Date commitedTime;

    @ApiModelProperty(value = "")
    private String commitedCmt;

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
    @ApiModelProperty(value = " DEFECT_WAITACCEPT(10, \"待受理\"),\n" +
            "    DEFECT_CANCEL(11, \"新报修撤销\"),\n" +
            "    DEFECT_ASSIGNED(12, \"已指派\"),\n" +
            "    DEFECT_SENDBACK(13, \"已退回\"),\n" +
            "    DEFECT_ACCEPTED(20, \"已受理\"),\n" +
            "    DEFECT_WAITCONFIRM(21, \"已修好等待确认\"),\n" +
            "    DEFECT_REJECTED(22, \"被拒绝\"),\n" +
            "    DEFECT_ACCEPTEDCANCEL(23, \"受理撤销\"),\n" +
            "    DEFECT_FINISHED(30, \"已修好\"),\n" +
            "    DEFECT_CONFIRMED(31, \"已确认\"),\n" +
            "    DEFECT_COMMITED(32, \"已评论\"),\n" +
            "    DEFECT_CLOSED(40, \"已关闭\"),\n" +
            "    DEFECT_TAKEBACK(50, \"收回\"),\n" +
            "    Defect_IGNORE(100, \"忽略\");")
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

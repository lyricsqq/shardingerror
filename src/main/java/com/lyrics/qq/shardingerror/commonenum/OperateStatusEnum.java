package com.lyrics.qq.shardingerror.commonenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OperateStatusEnum {
    DEFECT_WAITACCEPT(10, "待受理"),
    DEFECT_CANCEL(11, "新报修撤销"),
    DEFECT_ASSIGNED(12, "已指派"),
    DEFECT_SENDBACK(13, "已退回"),
    DEFECT_TAKEBACK(14, "已收回"),
    DEFECT_ACCEPTED(20, "已受理"),
    DEFECT_WAITCONFIRM(21, "已修好等待确认"),
    DEFECT_REJECTED(22, "被拒绝"),
    DEFECT_ACCEPTEDCANCEL(23, "受理撤销"),
    DEFECT_FINISHED(30, "已修好"),
    DEFECT_CONFIRMED(31, "已确认"),
    DEFECT_COMMITED(32, "已评论"),
    DEFECT_CLOSED(40, "已关闭"),
    Defect_IGNORE(100, "忽略");

    @EnumValue
    private Integer value;
    private String des;
}

package com.lyrics.qq.shardingerror.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.lyrics.qq.shardingerror.commonenum.StatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
public class BaseEntity implements Serializable {
	/**
	 * 逻辑删除枚举
	 * @see StatusEnum
	 */
	@TableLogic
	@TableField(fill = FieldFill.INSERT)
	private StatusEnum status;
	/**创建用户ID*/
	@TableField(fill = FieldFill.INSERT)
	private Integer createdUserId;
	/**创建时间*/
	@TableField(fill = FieldFill.INSERT)
	private Timestamp  createdTime;
	/**更新操作用户ID*/
	@TableField(fill = FieldFill.INSERT)
	private Integer lastUpdatedUserId;
	/**更新时间*/
	@TableField(fill = FieldFill.INSERT)
	private Timestamp lastUpdatedTime;
}

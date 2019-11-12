package com.lyrics.qq.shardingerror.constant;

import java.util.Date;

public final class LogicTableName {
    //数据库资源
    public final static String DB_RESOURCE = "master";
    // 点检计划信息 逻辑表名
    public final static String T_CHECK_TASK = "t_check_task";

    /**
     * 分表条件
     *
     * @param date
     * @return
     */
    public static String shardingCondition(Date date) {
        return  "";
    }

}

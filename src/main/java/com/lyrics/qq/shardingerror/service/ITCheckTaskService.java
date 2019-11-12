package com.lyrics.qq.shardingerror.service;

import com.lyrics.qq.shardingerror.vo.PlanStatisticsVo;

/**
 * <p>
 * 点检任务表 服务类
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
public interface ITCheckTaskService {


    /**
     *
     *
     * @param planStatisticsVo
     * @return
     */
    Object getColumnarStatistics(PlanStatisticsVo planStatisticsVo);

    Object getInCondition(PlanStatisticsVo planStatisticsVo);

    Object getInConditionOne(PlanStatisticsVo planStatisticsVo);

}

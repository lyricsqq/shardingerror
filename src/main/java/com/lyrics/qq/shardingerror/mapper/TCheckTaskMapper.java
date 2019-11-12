package com.lyrics.qq.shardingerror.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyrics.qq.shardingerror.entity.TCheckTask;
import com.lyrics.qq.shardingerror.vo.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 点检任务表 Mapper 接口
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Repository
public interface TCheckTaskMapper extends BaseMapper<TCheckTask> {

    /**
     *
     *
     * @param planStatisticsVo
     * @return
     */
    List<PlanColumnarStatisticsResultVo> getColumnarStatistics(PlanStatisticsVo planStatisticsVo);
    List<Map>  getInCondition(PlanStatisticsVo planStatisticsVo);

    List<Map>  getInConditionOne(PlanStatisticsVo planStatisticsVo);
}

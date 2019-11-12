package com.lyrics.qq.shardingerror.service.impl;

import com.lyrics.qq.shardingerror.constant.LogicTableName;
import com.lyrics.qq.shardingerror.mapper.TCheckTaskMapper;
import com.lyrics.qq.shardingerror.service.ITCheckTaskService;
import com.lyrics.qq.shardingerror.vo.PlanColumnarStatisticsResultVo;
import com.lyrics.qq.shardingerror.vo.PlanStatisticsVo;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 点检任务表 服务实现类
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Service
@Transactional
public class TCheckTaskServiceImpl implements ITCheckTaskService {
    @Autowired
    private TCheckTaskMapper tCheckTaskMapper;


    /**
     * 总览计划柱状图 查询
     *
     * @param planStatisticsVo
     * @return
     */
    public Object getColumnarStatistics(PlanStatisticsVo planStatisticsVo) {
        List<PlanColumnarStatisticsResultVo> planColumnarStatisticsResultVos = tCheckTaskMapper.getColumnarStatistics(planStatisticsVo);
        return planColumnarStatisticsResultVos;
    }


    public Object getInCondition(PlanStatisticsVo planStatisticsVo) {
        return tCheckTaskMapper.getInCondition(planStatisticsVo);
    }

    public Object getInConditionOne(PlanStatisticsVo planStatisticsVo) {
        return tCheckTaskMapper.getInConditionOne(planStatisticsVo);
    }
}

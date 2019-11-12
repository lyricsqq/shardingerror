package com.lyrics.qq.shardingerror.controller;


import com.lyrics.qq.shardingerror.service.ITCheckTaskService;
import com.lyrics.qq.shardingerror.vo.PlanColumnarStatisticsResultVo;
import com.lyrics.qq.shardingerror.vo.PlanStatisticsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Subquery problem
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@RestController
@RequestMapping(value = "checkTask")
@Api(description = "Subquery problem")
public class TCheckTaskController {
    @Autowired
    private ITCheckTaskService iTCheckTaskService;


    /**
     * Get class conversion exception
     *
     * @param planStatisticsVo
     * @return
     */
    @ApiOperation(value = "Range condition will report error  Get class conversion exception")
    @GetMapping("ck/getColumnarStatistics")
    public Object getColumnarStatistics(PlanStatisticsVo planStatisticsVo) {
        return iTCheckTaskService.getColumnarStatistics(planStatisticsVo);
    }

    @ApiOperation(value = "The reason why the in condition with multiple parameters will report errors is that the segments are in different tables")
    @GetMapping("ck/getInCondition")
    public Object getInCondition(PlanStatisticsVo planStatisticsVo) {
        return iTCheckTaskService.getInCondition(planStatisticsVo);
    }

    @ApiOperation(value = "If a single in condition is in a table, no error will be reported")
    @GetMapping("ck/getInConditionOne")
    public Object getInConditionOne(PlanStatisticsVo planStatisticsVo) {
        return iTCheckTaskService.getInConditionOne(planStatisticsVo);
    }
}

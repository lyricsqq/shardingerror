package com.lyrics.qq.shardingerror.shard;

import com.lyrics.qq.shardingerror.constant.DateUtil;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Date;

public class Precise implements PreciseShardingAlgorithm<Date> {
    Logger logger = LoggerFactory.getLogger(Precise.class);

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Date> shardingValue) {
        Date date = shardingValue.getValue();
        String key = DateUtil.formatDate(date, "yyyyMM");
        for (String target : availableTargetNames) {
            if (target.contains(key)) {
                logger.info("分表路由目标表:" + target);
                return target;
            }
        }
        return null;
    }
}

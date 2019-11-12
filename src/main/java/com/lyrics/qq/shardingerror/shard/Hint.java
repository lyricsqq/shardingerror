package com.lyrics.qq.shardingerror.shard;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;

public class Hint implements HintShardingAlgorithm<String> {
    public Logger logger = LoggerFactory.getLogger(Hint.class);

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, HintShardingValue<String> shardingValue) {
        logger.info("目标表:" + JSON.toJSONString(availableTargetNames));
        logger.info("目标表值:" + JSON.toJSONString(shardingValue));
        for (String dbName : availableTargetNames) {
            if (dbName.equals("master")) {
                return Lists.newArrayList("master");
            }
        }
        String table = shardingValue.getLogicTableName();
        List<String> tables = Lists.newArrayList();
        for (String value : shardingValue.getValues()) {
            tables.add(table + "_" + value);
        }
        return tables;
    }
}

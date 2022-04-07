package com.fen.dou.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class DBShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> shardingValue) {
        String columnName = shardingValue.getColumnName();
        Integer databaseNum = shardingValue.getValue() % collection.size();
        if ("school_id".equals(columnName)){
            return "master_"+databaseNum;
        }
        return null;
    }
}

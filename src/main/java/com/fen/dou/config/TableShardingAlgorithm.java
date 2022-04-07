package com.fen.dou.config;

import org.apache.commons.lang3.StringUtils;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class TableShardingAlgorithm  implements PreciseShardingAlgorithm<Integer> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> shardingValue) {
        String columnName = shardingValue.getColumnName();
        Integer tableNum = shardingValue.getValue() % collection.size();
        if ("user".equalsIgnoreCase(shardingValue.getLogicTableName()) && "id".equals(columnName)){
            return "user_"+tableNum;
        }
        return null;
    }
}

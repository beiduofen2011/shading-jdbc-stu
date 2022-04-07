package com.fen.dou.config;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

public class MyShardingKeyGenerator implements ShardingKeyGenerator {
    public static AtomicInteger ac = new AtomicInteger();

    @Override
    public Comparable<?> generateKey() {
        return ac.getAndIncrement();
    }

    @Override
    public String getType() {
        return "MyShardingKey";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}

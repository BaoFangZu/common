package com.exposure.common.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

//import org.springframework.cloud.Cloud;
//import org.springframework.cloud.CloudFactory;
//import org.springframework.cloud.config.java.AbstractCloudConfig;
//import org.springframework.cloud.service.PooledServiceConnectorConfig.PoolConfig;
//import org.springframework.cloud.service.keyval.RedisConnectionFactoryConfig;
//import org.springframework.cloud.service.relational.DataSourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

//@Configuration
public class CloudConfig {
		//extends AbstractCloudConfig {

//	@Bean
//	public Cloud cloud() {
//	  return new CloudFactory().getCloud();
//	}
	
/*    @Bean
    public DataSource inventoryDataSource() {
        PoolConfig poolConfig = new PoolConfig(5, 30, 3000);
        DataSourceConfig dbConfig = new DataSourceConfig(poolConfig, null);
        return connectionFactory().dataSource("mysql", dbConfig);
    }
    
    @Bean
    public RedisConnectionFactory redisFactory() {
      Map<String, Object> properties = new HashMap<String, Object>();
      properties.put("timeout", 10);
      PoolConfig poolConfig = new PoolConfig(5, 30, 3000);
      RedisConnectionFactoryConfig redisConfig = new RedisConnectionFactoryConfig(poolConfig, properties);
      return connectionFactory().redisConnectionFactory("redis", redisConfig);
    }*/
}

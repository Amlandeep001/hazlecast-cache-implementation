package com.javatechie.spring.cache.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionConfig;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizePolicy;

@Configuration
public class CacheConfig
{
	@Bean
	Config configure()
	{
		return new Config()
				.setInstanceName("hazlecast-insatnce")
				.addMapConfig(new MapConfig()
						.setName("userCache")
						.setEvictionConfig(new EvictionConfig()
								.setSize(200)
								.setMaxSizePolicy(MaxSizePolicy.FREE_HEAP_SIZE)
								.setEvictionPolicy(EvictionPolicy.LRU))
						.setTimeToLiveSeconds(2000));
	}
}

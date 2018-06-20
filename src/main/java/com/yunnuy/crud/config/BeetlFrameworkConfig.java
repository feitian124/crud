package com.yunnuy.crud.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class BeetlFrameworkConfig {
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.druid")
	public DataSource datasource() {
		DruidDataSource ds = new DruidDataSource();
		return ds;
	}
}

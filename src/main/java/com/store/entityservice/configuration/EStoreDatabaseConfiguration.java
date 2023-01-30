package com.store.entityservice.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableDiscoveryClient
public class EStoreDatabaseConfiguration {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String className;


    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .driverClassName(className)
                .url(url)
                .username(username)
                .password(password)
                .build();
    }

}

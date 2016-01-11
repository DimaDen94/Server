package com.bydmitry.swreminder.server.config;

/**
 * Created by Dmitry on 11.01.2016.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.bydmitry.swreminder.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("com.bydmitry.swreminder.server")
public class DataBaseConfig {
    @Resource
    private Environment env;
}

package com.bydmitry.swreminder.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Dmitry on 11.01.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.bydmitry.swreminder.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}

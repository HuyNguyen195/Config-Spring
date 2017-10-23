package com.fsoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableJpaRepositories("com.fsoft.persistence")
@ComponentScan(basePackages = { "com.fsoft" })
public class RootConfig {

}

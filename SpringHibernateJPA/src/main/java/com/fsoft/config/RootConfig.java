package com.fsoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.fsoft.repository")
@ComponentScan(basePackages = { "com.fsoft" } , basePackageClasses = { HibernateConfig.class })
public class RootConfig {

}

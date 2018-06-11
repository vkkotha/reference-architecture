package com.reference.app.application;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.reference" })
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories("com.reference.app.dal.dao")
@EntityScan( basePackages = "com.reference.app.dal.model" )
public class AppConfiguration {

}

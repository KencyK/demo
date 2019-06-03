package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@Configuration
@EnableMongoAuditing
@EnableTransactionManagement
@EnableJpaAuditing
@EnableJpaRepositories({"com.example.demo"})
@ComponentScan("com.example.demo")
public class ApplicationConfiguration {
}

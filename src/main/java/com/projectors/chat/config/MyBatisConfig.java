package com.projectors.chat.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.projectors.chat.dao")
public class MyBatisConfig {
}

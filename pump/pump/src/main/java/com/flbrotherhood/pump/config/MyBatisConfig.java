package com.flbrotherhood.pump.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * @author ctyFL
 * @date 2020年6月17日
 */
@Configuration
@MapperScan("com.flbrotherhood.pump.mbg.mapper")
public class MyBatisConfig {

}

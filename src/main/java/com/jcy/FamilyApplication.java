package com.jcy;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

@EnableSwagger2Doc
@SpringBootApplication
public class FamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyApplication.class, args);
	}

	/**
	 * mybatis基础增删改查插件
	 */
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		mapperScannerConfigurer.setBasePackage("com.jcy.mapper");
		Properties properties = new Properties();
		properties.setProperty("mappers", "com.jcy.BaseMapper");
		properties.setProperty("notEmpty", "false");
		properties.setProperty("ORDER", "BEFORE");
		mapperScannerConfigurer.setProperties(properties);
		return mapperScannerConfigurer;
	}
}

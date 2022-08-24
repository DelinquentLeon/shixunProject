package com.cqu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.cqu.mapper")
public class Shixunproject2Application {

	public static void main(String[] args) {
		SpringApplication.run(Shixunproject2Application.class, args);
	}

}
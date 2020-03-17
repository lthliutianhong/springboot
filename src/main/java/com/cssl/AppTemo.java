package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * 启动类
 * @author Administrator
 *
 */
@ServletComponentScan(basePackages= {"com.cssl.filter","com.cssl.listener"})
@MapperScan("com.cssl.dao")
@SpringBootApplication
public class AppTemo {

	public static void main(String[] args) {
	
         SpringApplication.run(AppTemo.class, args);
	}

}

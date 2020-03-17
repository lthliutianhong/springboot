package com.cssl;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cssl.interceptor.MyInterceptor;


/**
 * 实现WebMvcConfigurer接口 配置拦截器组件
 * @author Administrator
 *
 */
@Component
public class MyConfinger implements WebMvcConfigurer {

	//拦截器
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor())
		//.addPathPatterns("/*","/image/*");
		.addPathPatterns("/**")
		.excludePathPatterns("/image/*");
		WebMvcConfigurer.super.addInterceptors(registry);
	}

	
	
}

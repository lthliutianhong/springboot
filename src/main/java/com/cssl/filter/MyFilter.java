package com.cssl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


/**
 * 过滤器 配置需要过滤的请求 权限控制 顺序在拦截器之后
 * @author Administrator
 *
 */
@WebFilter
public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter before..");

		chain.doFilter(request, response);
		
		System.out.println("doFilter after...");
	}

}

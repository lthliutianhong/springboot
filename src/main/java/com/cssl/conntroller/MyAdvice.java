package com.cssl.conntroller;


import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 全局异常配置
 * @author Administrator
 *
 */
@ControllerAdvice
public class MyAdvice {

	public String doException(Exception e) {
		System.out.println("doException:"+e.getMessage());
		return "error";
		
	}
}

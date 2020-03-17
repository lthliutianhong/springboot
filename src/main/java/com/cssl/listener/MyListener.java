package com.cssl.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听器 配置  需要监听的对象
 * @author Administrator
 *
 */
@WebListener
public class MyListener implements HttpSessionListener,ServletContextListener {

	

	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("application创建");
		
	}


	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("application销毁");
		
	}



	/**
	 * 创建
	 */
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session监听器创建了。");
		
	}

	
	
	/**
	 * 销毁
	 * 
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session监听器销毁了。");
		
	}
	
	

}

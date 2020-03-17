package com.cssl;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


/**
 * 读取配置信息，初始化一些需要的相关需求 整个应用程序初始化
 * @author Administrator
 *
 */
@Component
public class MyRunner implements ApplicationRunner {

    //初始化启动
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("MyRunner: run方法");
	}

}

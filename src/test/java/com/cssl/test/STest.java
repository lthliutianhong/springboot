package com.cssl.test;

import org.hamcrest.core.StringEndsWith;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试类
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class STest {

	
	//加密字符串
	@Autowired
    StringEncryptor encryptor;

    @Test
    public void getPass() {
        String url = encryptor.encrypt("jdbc:mysql:///ttt?serverTimezone=UTC");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("root");
        System.out.println(url);
        System.out.println(name);
        System.out.println(password);
	
}
}
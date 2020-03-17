package com.cssl.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cssl.pojo.Users;
import com.github.pagehelper.Page;


public interface UsersService {

	public boolean saveUsers(Users user);
	
	
	//查询用户名和密码
			public Users AddSelect(@Param("username")String username,
					                 @Param("password")String password);
			
			//查询用户信息
			public List<Users> addlist();
			
	
			
}

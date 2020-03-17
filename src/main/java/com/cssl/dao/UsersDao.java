package com.cssl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cssl.pojo.Users;


public interface UsersDao {

	public int insertUser(Users user);
	
	//查询用户名和密码
		public Users AddSelect(@Param("username")String username,
					          @Param("password")String password);
		
		//查询用户信息
	public List<Users> addlist();	
		
		
}

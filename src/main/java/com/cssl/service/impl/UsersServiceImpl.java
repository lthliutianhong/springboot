package com.cssl.service.impl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cssl.dao.UsersDao;
import com.cssl.pojo.Users;
import com.cssl.service.UsersService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;



@Service
@Transactional
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao udao;
	

	@Override
	public boolean saveUsers(Users user) {
		
		System.out.println("UsersServiceImpl saveUsers");
		if(udao.insertUser(user)>0) {			
			return true;
		}			
		return false;
	}


	@Override
	public Users AddSelect(String username, String password) {
		
		Users user= udao.AddSelect(username, password);
		return user;
	}


	@Override
	public List<Users> addlist() {
		
		return udao.addlist();
	}


	

	
}

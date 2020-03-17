package com.cssl.conntroller;



import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cssl.pojo.Users;
import com.cssl.service.UsersService;
import com.cssl.vo.UsersVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;




/**
 * 控制器
 * @author Administrator
 *
 */

@Controller
public class UsersController {

	@Autowired
	private UsersService service;
	
	
	@PostMapping("/regist")
	public String regist(UsersVo uvo ) {
		System.out.println("regist:"+ uvo.getUsername());
		//vo->pojo
		Users user=new Users();
		BeanUtils.copyProperties(uvo, user);
		if(service.saveUsers(user)) 
			//没有视图解析器
			//return "redirect:"/success.jsp;
			return "success";
		return "index";
			
	}
	
	
	
	//登录验证
		@RequestMapping("/denglu")
		public String denglu(String username, String password,HttpSession session,HttpServletRequest request) {
			System.out.println("chankan :"+username+password);
			Users user=service.AddSelect(username, password);
			if(user!=null) {
				session.setAttribute("user",user);
				
				//session.setAttribute("userr", "登录成功");
				return "redirect:/addlisr";
			}else{			
				request.setAttribute("regs", "登录失败");
				return "success";
				
			}
			
			
		}
	
		@RequestMapping("/query")
        public String query(Model model,@RequestParam Map<String, Object> map) {  
			String  pageON=(String) map.get("pageNo");
			if(pageON==null||pageON=="") {
				pageON="1";
			}
			int pageNO=Integer.parseInt(pageON);
			int pageSize =2;			
			Page page=PageHelper.startPage(pageNO,pageSize);
			List<Users>	user=service.addlist();		
        	model.addAttribute("user",user);
        	model.addAttribute("page",page);
        	if(user!=null) {
        		return "list";
        	}else {
        		return "success";
        	}
			
        	
        }
		
}

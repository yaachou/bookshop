package org.fkit.bookshop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.fkit.bookshop.bean.User;
import org.fkit.bookshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bookshop")
public class UserController {
	
	// 注入UserService
	@Autowired 
	
	private  UserService userService;

	@RequestMapping("/login")
	public  String Login() {
		return "login";
	}		
	
	@RequestMapping("/registerform")
	public  String registerForm() {
		return "register";
	}	
	
	@RequestMapping("/deleteform2")
	public  String deleteForm2() {
		return "deleteuser";
	}
	
	@RequestMapping("/pay")
	public  ModelAndView Pay(HttpServletRequest req) {
		String recipient = req.getParameter("recipient");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("pay");
		mv.addObject("recipient",recipient);
		mv.addObject("phone",phone);
		mv.addObject("address",address);
		return mv;
	}
	
	@RequestMapping("/saveuser")
	public @ResponseBody String save(HttpServletRequest req) {
		User user = new User();
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		user.setMoney(1000);
		user = userService.save(user);
		return "添加用户成功！";
	}
	
	@RequestMapping("/deleteuser")
	public @ResponseBody String delete(HttpServletRequest req) {	
		userService.delete(Integer.parseInt(req.getParameter("userid")));
		return "指定id用户注销成功！";
	}
	
	@RequestMapping("/getAlluser")
	public  ModelAndView getAllUser() {
		Iterable<User> user= userService.getAll();
		
		List<User> listUser = new ArrayList<User>();
			  
		user.forEach(single->listUser.add(single));
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displayuser");
		mv.addObject("users", listUser);
		
		return mv;
	}
}

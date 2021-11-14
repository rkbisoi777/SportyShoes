package com.simplilearn.SportyShoesProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.SportyShoesProject.entity.User;
import com.simplilearn.SportyShoesProject.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userservice;
	
	//@GetMapping("/list")
	//public List<UserDetails> getUserDetails()
	//{
		 //List<UserDetails> listuser = new ArrayList<UserDetails>();
		 //listuser= userservice.getUsers();
		// return listuser;
	//}
	
	@GetMapping("/index")
	public String viewUserDetails(Model model)
	{
		List<User> listUsers= userservice.listAll();
		System.out.println("listUsers" + listUsers);
		model.addAttribute("listUsers",listUsers);
		return "/index";
	}
	
	
	
	
//	@GetMapping("/find")
//	public List<UserDetails> findusername(@RequestParam("username")  String username)
//	{
//		List<UserDetails> searchuser =new ArrayList<UserDetails>();
//		searchuser = userservice.get(username);
//		System.out.println("user"+ searchuser);
//		return searchuser;
//	}
	
	
	@GetMapping("/user/{username}")
	public String findUserName(@PathVariable(name="username")String username)
	{	
		System.out.println("i am here");
		ModelAndView mav = new ModelAndView("find");
		List<User> user=userservice.get(username);
		mav.addObject("userdetails", user);
		return "finduser";
	}
	
	
	
	

}

package com.simplilearn.SportyShoesProject.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.simplilearn.SportyShoesProject.entity.Login;
import com.simplilearn.SportyShoesProject.service.LoginService;


@Controller
public class LoginController {

	@Autowired
	private LoginService ls;

	@GetMapping("/")
	public ModelAndView login() {
		
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new Login());
		return mav;
	}

	@PostMapping("/adminlogin")
	public String signUp(@ModelAttribute("user") Login user ) {
		Login oauthUser = null;
		System.out.println("from login"+ user);
		
		if(user.getPassword() != "" ) {
			System.out.println("logging in");	
			oauthUser = ls.signgin(user.getUsername(), user.getPassword());
			return "menu";
		} else {
			if (user.getNewPassword() != "" ) {
				System.out.println("Changing new password");
				oauthUser = ls.changePassword(user.getUsername(), user.getNewPassword());
				if(oauthUser == null ) {
					return "invalid_credentials";
				}
				return "menu";
			}
			return "invalid_credentials";	
		} 
	}
	
	@GetMapping("/change_password")
	public String update(@ModelAttribute("user") Login user){
			return "change_password";

		}


	@RequestMapping("/logout")
	public String logoutDo()
	{
		return "logout";
	}

}
package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.User;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	//@RequestMapping(value="/validateuser",method=RequestMethod.POST)
	@PostMapping("/validateUser")
	public ModelAndView validateUser(HttpSession session,@RequestParam("uname") String uname,@RequestParam("pass") String pass) {
		System.out.println(uname+"----"+pass);
		User u=loginService.validateUser(uname,pass);
		
		if(u!=null){
			session.setAttribute("user", u);
			return new ModelAndView("redirect:/product/viewProduct");
			
		}
		else {
			return new ModelAndView("index","msg","pls reenter crendentials");
		}
	}

}

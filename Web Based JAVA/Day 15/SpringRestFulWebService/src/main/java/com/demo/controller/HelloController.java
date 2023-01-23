package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/index")
	public String displaylogin() {
		System.out.println("in display login");
		return "index";
	}
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ModelAndView sayHello() {
		String str="Hello world1111!!";
		return new ModelAndView("displayhello","msg",str);
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public ModelAndView testdata(Model map) {
		map.addAttribute("str","Testing");
		map.addAttribute("str1","Testing123");
		return new ModelAndView("displayhello","msg",map);
	}
	
	@RequestMapping("/welcome")
	public String welcomedisplay() {
		return "welcome";
	}

}

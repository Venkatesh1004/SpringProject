package com.easylearnjava.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.easylearnjava.loginservice.LoginServiceDemo;
import com.easylearnjava.model.LoginFormDemo;

@Controller
public class LoginControllerDemo {
	
	@Autowired
	LoginServiceDemo ls;
	

	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public String loginGetRequest(Model model) {
		System.out.println("11111");
		model.addAttribute("modelObjForm", new LoginFormDemo());
		return "LoginPage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPageRequest() {
		System.out.println("inside loginpage");
		ModelAndView mv = new ModelAndView("LoginPage");
		mv.addObject("modelObjForm", new LoginFormDemo());
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPostRequest(@Valid @ModelAttribute("modelObjForm") LoginFormDemo loginForm, BindingResult result) {
		System.out.println("inside post method");
		if(result.hasErrors()){
			return "LoginPage";
			
		}
		System.out.println("444444444");
		boolean isValid = ls.checkData(loginForm.getUsername(), loginForm.getPassword());
		if(isValid)
		{
			return "LoginSuccess";
		}
		return "LoginPage";
		
	}

}

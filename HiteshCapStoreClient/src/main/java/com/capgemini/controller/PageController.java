package com.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.entities.Customer;
import com.capgemini.entities.Merchant;

@Controller
public class PageController {

	
	@RequestMapping("/")
	public String consume(){
		return "welcome";
	}
	
	
	@RequestMapping("/showCustomerSignUp")
	public String showCustomerSignUp(@ModelAttribute("customer") Customer customer){
		return "customerSignUp";
	}
	
	@RequestMapping(value = "/CustomerHome")
	public String showSignUpCust(@ModelAttribute("customer") Customer customer)
	{
		return "CustomerSignUp";
	}
	
}

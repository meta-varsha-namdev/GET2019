package com.metacube.training.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.metacube.training.service.AdminService;


@Controller
public class WebSiteController {

	
	@Autowired
	private AdminService adminService;

	/*
	 * First request for first page will come here when tomcate will start
	 * @return login, which will call login.jsp page 
	 * after returning login string here spring-servlet.xml file will append .jsp here
	 * */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage() {

		return "login";

	}

	/*
	 * @param username of user for login
	 * @param userpassword of user for login
	 * @return "welcome"(i.e. will open welcome.jsp) if [username and userpassword is valid] else will open login.jsp page back
	 * */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logedIn(@RequestParam("userName")String userName,@RequestParam("userPassword")String userPassword) {
		boolean status = adminService.isAdminExist(userName,userPassword);

		if(status==true) {
			return "home";
		}else {
			return "login";
		}

	}

	/*
	 * @return "home" i.e. home.jsp page will open
	 * */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {

		return "home";

	}


}

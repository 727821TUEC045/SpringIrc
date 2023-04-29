package com.example.BrownieCakes.Controller;
 import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.BrownieCakes.Model.LoginModel;
import com.example.BrownieCakes.Service.Loginservice;

@RestController

public class LoginController {
	
@Autowired
private Loginservice service;

@PostMapping("/login")
public String login(@RequestBody Map<String,String>loginData)
{
	String name=loginData.get("name");
	String pwd=loginData.get("pwd");
	String result=service.checkLogin(name,pwd);
	 return result;
}

//posting the details
@PostMapping("/cgems")
public LoginModel adddetails(@RequestBody LoginModel id)
{
	return service.adddetails(id);
}
}

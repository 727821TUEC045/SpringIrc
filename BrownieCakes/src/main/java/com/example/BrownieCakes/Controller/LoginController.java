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



@PostMapping("/posting")
public String login(@RequestBody Map<String,String>loginData)
{
	String uname=loginData.get("uname");
	String password=loginData.get("password");
	String result=service.checkLogin(uname,password);
	 return result;
}

//posting the details
@PostMapping("/cgems")
public LoginModel adddetails(@RequestBody LoginModel id)
{
	return service.adddetails(id);
}
}

package com.example.day1.Classex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassEx1 
{
	@GetMapping("/welcome")
	@ResponseBody
public String hi()
     {

	   return "janani"	;
	}

}

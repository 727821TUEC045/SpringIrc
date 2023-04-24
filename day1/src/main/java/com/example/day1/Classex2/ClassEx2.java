package com.example.day1.Classex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClassEx2 {
	public String name="Iamneo";
	@GetMapping("/setName")
	public String getName()
	{
		return "welcome "+name;
	}

}

package com.example.day1.Valueano;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueAno {
	@Value("${carname:'creta'}")
     public String car;
     @GetMapping("/mycar")
     @ResponseBody
     public String car()
     {
    	 return "My fav car "+car;
     }
}

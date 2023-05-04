package com.example.BrownieCakes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.BrownieCakes.Model.QModel;
import com.example.BrownieCakes.Repository.QRepo;

@RestController
public class QController 
 {
	@Autowired
	QRepo rep;
	
	
	//posting the given details
	@PostMapping("/posting")
	public String adddetails(@RequestBody QModel ques)
	{
		rep.save(ques);
		return "saved successfully";
	}
	

}

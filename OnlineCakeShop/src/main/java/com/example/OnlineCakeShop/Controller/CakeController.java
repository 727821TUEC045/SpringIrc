package com.example.OnlineCakeShop.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineCakeShop.Service.CakeService;
import com.example.OnlineCakeShop.Model.CakeModel;

@RestController
public class CakeController {
	@Autowired
	public CakeService Cser;
	
	//post mapping
    @PostMapping("/gems")
	public CakeModel  addDetails(@RequestBody CakeModel cr)
	{
		return Cser.saveinfo(cr);
	}
    
    
    @DeleteMapping("/gems/{id}")
    public String deletedetails(@PathVariable("id")int id)
    {
    	Cser.deletedetails(id);
    	return "delete successfully";
    }
    
    @GetMapping("/gems/{id}")
    public Optional<CakeModel> getdetails(@PathVariable("id")int id)
    {
    	return Cser.getdetails(id);
    			
    }
    @PutMapping("/update")
    public CakeModel upadatedetails(@RequestBody CakeModel id)
    {
    	return Cser.updatedetails(id);
    }
    
	
	
	

}

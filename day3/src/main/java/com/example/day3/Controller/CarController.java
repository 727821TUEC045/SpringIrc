package com.example.day3.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.day3.Service.CarService;
import com.example.day3.Model.CarModel;

@RestController
public class CarController {
	@Autowired
	public CarService Cser;
	
	//posting details
	@PostMapping("/save")
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return Cser.saveinfo(cr);
	}
	
	
	//deleting details
	@DeleteMapping("/save/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		Cser.deletedetails(id);
		return "deleted successfully";
	}
	
	//getting details
	@GetMapping("/save/{id}")
	public Optional<CarModel> getdetails(@PathVariable ("id")int id)
	{
		return Cser.getdetails(id);
	}
	
	
//updating details
	@PutMapping("/update")
	public CarModel updatedetails(@RequestBody CarModel id)
	{
		return Cser.updatedetails(id);
	}
	
	}

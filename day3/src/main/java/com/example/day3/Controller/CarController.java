package com.example.day3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.day3.Service.Carservice;
import com.example.day3.Model.CarModel;

@RestController
public class CarController {
	@Autowired
	public CarService Cser;
	@PostMapping("/saveCar")
	public carModel addDetails(@RequestBody CarModel cr)
	{
		return cser.saveninfo(cr);
	}

}
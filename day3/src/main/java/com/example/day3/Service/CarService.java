package com.example.day3.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day3.Model.CarModel;
import com.example.day3.Repository.CarRepo;

@Service
public class CarService {
	@Autowired
	public CarRepo crepo;
	public CarModel saveinfo(CarModel c)
	{
		return crepo.save(c);
	}

}

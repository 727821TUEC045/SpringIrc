package com.example.OnlineCakeShop.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineCakeShop.Model.CakeModel;
import com.example.OnlineCakeShop.Repo.CakeRepo;


@Service
public class CakeService {
	@Autowired
	
	public CakeRepo Crepo;
	public CakeModel saveinfo(CakeModel cr)
	{
		return Crepo.save(cr);
	}
	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		Crepo.deleteById(id);
	}
	public Optional<CakeModel> getdetails(int id) {
		// TODO Auto-generated method stub
		return Crepo.findById(id);
	}
	public CakeModel updatedetails(CakeModel id) {
		// TODO Auto-generated method stub
		return Crepo.saveAndFlush(id);
	}
	
	
	

}

package com.example.BrownieCakes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BrownieCakes.Model.CakesModel;
import com.example.BrownieCakes.Repository.CakesRepo;
@Service
public class CakesServ {
	@Autowired
	public CakesRepo Crepo;

	public CakesModel saveinfo(CakesModel cr) {
		// TODO Auto-generated method stub
		return  Crepo.save(cr);
	}

	public java.util.Optional<CakesModel> getdetetails(int id) {
		// TODO Auto-generated method stub
		return Crepo.findById(id);
	}

	public void deletedetetails(int id) {
		// TODO Auto-generated method stub
		Crepo.deleteById(id);
	}

	public CakesModel updatedetails(CakesModel id) {
		// TODO Auto-generated method stub
		return Crepo.saveAndFlush(id);
	}
	

}

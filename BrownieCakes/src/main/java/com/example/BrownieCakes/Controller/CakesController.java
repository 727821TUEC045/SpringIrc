package com.example.BrownieCakes.Controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.BrownieCakes.Model.CakesModel;
import com.example.BrownieCakes.Repository.CakesRepo;
import com.example.BrownieCakes.Service.CakesServ;
@RestController
public class CakesController {
	@Autowired
	public CakesServ Cser;
	
	//post mapping
	@PostMapping("/post")
	public CakesModel addDetails(@RequestBody CakesModel cr)
	{
		return Cser.saveinfo(cr);
	}
	
	
	//get details
	@GetMapping("/get/{id}")
	public Optional<CakesModel>getdetails(@PathVariable("id")int id)
	{
		return Cser.getdetetails(id);
	}
	
	//delete details
	@DeleteMapping("/delete/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		Cser.deletedetetails(id);
		return "deleted successfully";
	}
	
	//updating details
	@PutMapping("/update")
	public CakesModel updatedetails(@RequestBody CakesModel id)
	{
		return Cser.updatedetails(id);
	}
	
	//sort by ascending order
	@GetMapping("sortDesc/{name}")
	public List<CakesModel>sortPerrson(@PathVariable("name")String name )
	{
		return Cser.sortDesc(name);
	}
	
	//descending
	@GetMapping("sortDescs/{name}")
	public List<CakesModel>sortPerrsons(@PathVariable("name")String name )
	{
		return Cser.sortDescs(name);
	}
	
	//pagination data
	@GetMapping("/pagination/{pgn}/{pgs}")
	public List<CakesModel>paginationDate(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
	{
		return Cser.paginationData(pgn,pgs);
	}
	
	//pagination sorting
	@GetMapping("/paginationsorting/{pgn}/{pgs}/{name}")
	public List<CakesModel>paginationAndSorting(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("name")String name)
	{
		return Cser.paginationAndSorting(pgn,pgs,name);
	}

	@Autowired
	public CakesRepo csr;
	@GetMapping("/bakes")
	public List<CakesModel>getD()
	{
		return csr.getAllData();
	}
	
	@GetMapping("/byName/{id}")
	public List<CakesModel>getNames(@PathVariable("id")int cid)
	{
		return csr.byname(cid);
	}

	
	
}

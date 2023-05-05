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

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
public class CakesController {
	@Autowired
	public CakesServ Cser;
	
	//post mapping
	@Tag(name ="post",description ="post the given details")
	@PostMapping("/post")
	public CakesModel addDetails(@RequestBody CakesModel cr)
	{
		return Cser.saveinfo(cr);
	}
	
	
	//get details
    @Tag(name ="get",description ="get the id in the  given details")
	@GetMapping("/get/{id}")
	public Optional<CakesModel>getdetails(@PathVariable("id")int id)
	{
		return Cser.getdetetails(id);
	}
	
	//delete details
    @Tag(name ="delete",description ="delete the id in the  given details")
	@DeleteMapping("/delete/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		Cser.deletedetetails(id);
		return "deleted successfully";
	}
	
	//updating details
    @Tag(name ="update",description ="update the given details")
	@PutMapping("/update")
	public CakesModel updatedetails(@RequestBody CakesModel id)
	{
		return Cser.updatedetails(id);
	}
	
	//sort by ascending order
    @Tag(name ="sortDesc",description ="sorting the given details in ascending order")
	@GetMapping("sortDesc/{name}")
	public List<CakesModel>sortPerrson(@PathVariable("name")String name )
	{
		return Cser.sortDesc(name);
	}
	
	//descending
    @Tag(name ="sortDescs",description ="sorting the given details in decending order")
	@GetMapping("sortDescs/{name}")
	public List<CakesModel>sortPerrsons(@PathVariable("name")String name )
	{
		return Cser.sortDescs(name);
	}
	
	//pagination data
    @Tag(name ="pagination",description ="pagination of data")
	@GetMapping("/pagination/{pgn}/{pgs}")
	public List<CakesModel>paginationDate(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
	{
		return Cser.paginationData(pgn,pgs);
	}
	
	//pagination sorting
    @Tag(name ="pagination sorting",description ="pagination and sorting of data")
	@GetMapping("/paginationsorting/{pgn}/{pgs}/{name}")
	public List<CakesModel>paginationAndSorting(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("name")String name)
	{
		return Cser.paginationAndSorting(pgn,pgs,name);
	}

	@Autowired
	public CakesRepo csr;
	@Tag(name ="getall",description ="getall the details")
	@GetMapping("/bakes")
	public List<CakesModel>getD()
	{
		return csr.getAllData();
	}
	
	
	@Tag( name ="byname",description ="get byname")
	@GetMapping("/byName/{id}")
	public List<CakesModel>getNames(@PathVariable("id")int cid)
	{
		return csr.byname(cid);
	}
	
	@Tag(name ="startend",description ="to get the details between two id")
	@GetMapping("/startend/{start}/{end}")
	public List<CakesModel>statendId(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return csr.startEnd(start,end);
	}
	
	@Tag(name ="deletebyid",description ="to delete the detials by deletebyid")
    @DeleteMapping("/deletebyid/{id}/{name}")
    public String deletePerson(@PathVariable("id")int id,@PathVariable("name")String name)
    {
    	csr.deleteId(id,name);
    	return "deleted";
    }
	
	@Tag(name ="updatequery",description ="to update the query from the given details")
    @PutMapping("/updatequery/{id}/{name}")
    public void updateByQuery(@PathVariable("id")int id,@PathVariable("name")String name)
    {
    	csr.updateByQuery(id,name);
    }
    
    //get by name using
	@Tag(name ="jpqlget",description ="to get the name in the given details using jpqlget")
    @GetMapping("/jpqlget/{name}")
    public List<CakesModel>getdetailname(@PathVariable("name")String name)
    {
    	return csr.getjpqlname(name);
    }
    
    
  //delete by jpql query by id
	@Tag(name ="deletejpql",description ="to deletejpql in the given details ")
    @DeleteMapping("/deletejpql/{id}")
    public String deletejpqlid(@PathVariable("id")int id )
    {
  	  csr.deletejpqlid(id);
  	  return "Deleted successfully using JPQL Query !";
    }
	
    //update by jpql query 
	@Tag(name ="updatejpql",description ="to updatejpql to the given details")
    @PutMapping("/upadtejpql/{a}/{b}")
     public void updatejpql(@PathVariable("a")String a,@PathVariable("b")int b)
     {
    	 csr.updatejpql(a,b);
     }
	 //jpql query for getting details using btw
	@Tag(name ="getbtw",description ="to get details between two id")
    @GetMapping("/getbtw/{start}/{end}")
    public List<CakesModel>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)
    {
    	return csr.getbtw(start,end);
    }
    
}

package com.example.BrownieCakes.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.BrownieCakes.Model.CakesModel;
public interface CakesRepo extends JpaRepository<CakesModel,Integer> {
	

	

	@Query(value="Select * from Treat",nativeQuery=true)
	public List<CakesModel>getAllData();
	
	

	@Query(value="Select * from Treat where id=:id",nativeQuery=true)
	public List<CakesModel> byname(@Param("id")int id);
	
	
	
	
	
}

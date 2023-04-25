package com.example.BrownieCakes.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BrownieCakes.Model.CakesModel;
public interface CakesRepo extends JpaRepository<CakesModel,Integer> {
	

}

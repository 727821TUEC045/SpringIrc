package com.example.BrownieCakes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BrownieCakes.Model.AModel;
public interface ARepo extends JpaRepository<AModel, Integer> 
{

}

package com.example.OnlineCakeShop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineCakeShop.Model.CakeModel;
public interface CakeRepo extends JpaRepository<CakeModel,Integer> {

}

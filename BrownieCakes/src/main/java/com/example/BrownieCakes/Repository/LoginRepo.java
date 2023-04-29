package com.example.BrownieCakes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BrownieCakes.Model.LoginModel;

public interface LoginRepo  extends JpaRepository<LoginModel,Integer>{
	LoginModel findByname(String name);

}

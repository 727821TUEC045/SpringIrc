package com.example.BrownieCakes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BrownieCakes.Model.QModel;
public interface QRepo  extends JpaRepository<QModel, Integer>
{

}

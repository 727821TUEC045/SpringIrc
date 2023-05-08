package com.example.loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Models.LoanApplicationModel;

public interface LoanRepo  extends JpaRepository<LoanApplicationModel, Integer>{

}

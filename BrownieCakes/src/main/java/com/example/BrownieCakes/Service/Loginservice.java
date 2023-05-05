package com.example.BrownieCakes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BrownieCakes.Model.LoginModel;
import com.example.BrownieCakes.Repository.LoginRepo;
@Service
public class Loginservice {
@Autowired
private LoginRepo repol;
	public String checkLogin(String uname, String password)
   {
	LoginModel user=repol.findByname(uname);
	if(user==null)
		// TODO Auto-generated method stub
	{
		return "No User Found";
	}
	else
	{
		if(user.getPassword().equals(password))
		{
			return "Login successfull";		
			
	     }
	else
	{
		return"Login Failed";
	}
   }
}

	public LoginModel addUser(LoginModel mod) 
	{
		// TODO Auto-generated method stub
		return repol.save(mod);
	}

	public List<LoginModel> getUser() {
		// TODO Auto-generated method stub
		return repol.findAll();
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return "Deleted";
	}

	public LoginModel adddetails(LoginModel id) {
		// TODO Auto-generated method stub
		return repol.save(id);
	}

}

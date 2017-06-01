package com.easylearnjava.loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easylearnjava.logindao.LoginDaoDemo;



@Service
public class LoginServiceDemo {

	@Autowired
	LoginDaoDemo ds;
	

public boolean checkData(String uname, String pswd){
		
		
		String password = ds.getPassword(uname);
		
		if(password!= null && password.equals(pswd))
		{
			return true;
		}
		 return false;
}
}

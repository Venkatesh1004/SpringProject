package com.easylearnjava.logindao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoDemo {
	
	@Autowired
	private JdbcTemplate template;
	
	public String getPassword(String username){

		String password = null;
		try{
			String SQL = "select password from usercredentials where username= ?";
			password= template.queryForObject(SQL, new Object[]{username}, String.class);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return password;
		
	}
	
	
	

}

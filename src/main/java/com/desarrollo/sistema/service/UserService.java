package com.desarrollo.sistema.service;

import java.util.ArrayList;
import java.util.List;

import com.desarrollo.sistema.model.User;

public class UserService {
	
	private static final long serialVersionUID = 1L;
	
	private List<User> users;

	public List<User> getUsers() {
		
		users = new ArrayList<User>();	        
        User user = new User();
        
        user.setNombre("geral");
        user.setApellido("henriquez");
        users.add(user);	     
		
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	
	

}

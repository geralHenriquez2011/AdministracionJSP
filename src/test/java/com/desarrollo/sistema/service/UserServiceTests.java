package com.desarrollo.sistema.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.desarrollo.sistema.model.User;

public class UserServiceTests {
	
	 private UserService service;
	 private List<User> users;
	
	 
	 
	 	@Before
	    public void setUp() throws Exception {
	        service = new UserService();
	        users = new ArrayList<User>();	        
	        User user = new User();
	        
	        user.setNombre("geral");
	        user.setApellido("henriquez");
	        users.add(user);	        
	        service.setUsers(users);
   
	    }

	    	    
	    @Test
	    public void testGetUsers() {
	    	
	    	List<User> usuarios = service.getUsers();
	        
	    	
	    }
	 
}

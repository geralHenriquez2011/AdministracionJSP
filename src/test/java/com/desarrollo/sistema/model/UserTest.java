package com.desarrollo.sistema.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	    private User user;

	    @Before
	    public void setUp() throws Exception {
	    	user = new User();
	    }

	    @Test
	    public void testSetAndGetDescription() {
	        String testDescription = "geral";
	        assertNull(user.getNombre());
	        user.setNombre("geral");
	        assertEquals(testDescription, user.getNombre());
	    }

	    @Test
	    public void testSetAndGetPrice() {
	        String testPrice = "henriquez";
	        assertEquals(0, 0, 0);    
	        user.setApellido("henriquez");
	        assertEquals(testPrice, user.getApellido());
	    }

}

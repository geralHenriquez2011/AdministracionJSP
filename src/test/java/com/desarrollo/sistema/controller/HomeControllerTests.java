package com.desarrollo.sistema.controller;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTests {

	 @Test
	    public void testHandleRequestView() throws Exception{		
	        HomeController controller = new HomeController();
	        ModelAndView modelAndView = controller.handleRequest(null, null);		
	        assertEquals("index", modelAndView.getViewName());
	        assertNotNull(modelAndView.getModel());
	        
	        @SuppressWarnings("unchecked")
	        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("users");
	        String nowValue = (String) modelMap.get("now");
	        assertNotNull(nowValue);
	        
	      

	    }
}

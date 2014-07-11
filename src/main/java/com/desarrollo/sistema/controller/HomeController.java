package com.desarrollo.sistema.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.desarrollo.sistema.model.User;
import com.desarrollo.sistema.service.UserService;

@Controller
public class HomeController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	
    @RequestMapping(value="/index")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	 UserService userService = new UserService();
    	
    	 String now = (new Date()).toString();
         logger.info("Retornando fecha a index.jsp" + now);
         
         
         

         Map<String, Object> modelView = new HashMap<String, Object>();               
         
         modelView.put("fecha", now);
         modelView.put("users", userService.getUsers());
         
         ModelAndView model = new ModelAndView("index");
         model.addObject("msg","hola");
         model.addObject("now", now);
         model.addObject("usuarios",modelView);
         return model;
         
    }

}

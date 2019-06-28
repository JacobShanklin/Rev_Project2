package com.bluebarracuda.aop;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.http.ResponseEntity;

import com.bluebarracuda.controller.SessionController;
import com.bluebarracuda.model.User;

public class Aspect {
	
	@After("execution(* com.bluebarracuda.controller.Session*(ResponseEntity<User> , ..))")  
	public void logging(JoinPoint jp) {
		
		final Logger log  = Logger.getLogger(SessionController.class);
		
		log.setLevel(Level.INFO);
		
	}

	

}

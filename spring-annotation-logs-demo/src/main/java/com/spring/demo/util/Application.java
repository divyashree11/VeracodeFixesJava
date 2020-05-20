package com.spring.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.demo.model.User;
import com.spring.demo.service.UserDetailsService;

//scan given package for dependencies
@ComponentScan("com.spring.demo")
public class Application {
	
	public static final CustomLogger LOGGER = new CustomLogger();

	public static void main(String[] args) {
		
		//tell application context to fetch bean details based on annotations
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Application.class);
		
		User u1 = new User();
		u1.setName("Peter");
		u1.setRole("Student");
		
		//get bean from context along with all its dependencies
		UserDetailsService service = appContext.getBean("UserDetailsService",UserDetailsService.class);
		
		LOGGER.info(service.createUser(u1));
	}
}

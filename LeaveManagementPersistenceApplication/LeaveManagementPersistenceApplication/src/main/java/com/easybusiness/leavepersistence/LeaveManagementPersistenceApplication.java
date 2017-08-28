package com.easybusiness.leavepersistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easybusiness.leavepersistence.user.UserDao;


@SpringBootApplication
public class LeaveManagementPersistenceApplication implements CommandLineRunner{
	@Autowired
	UserDao userDao;
	
	 @Autowired
	    
	 private static final Logger LOGGER = LoggerFactory.getLogger(LeavePersistenceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementPersistenceApplication.class, args);
		
		LOGGER.info("inside Leave Persistence App");
	}
	 @Override
	    public void run(String... args) throws Exception {
		LOGGER.info("inside run");

	    }

	}
	 





  
    

 

//
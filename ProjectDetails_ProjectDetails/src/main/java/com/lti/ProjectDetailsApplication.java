package com.lti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectDetailsApplication {
	
	public static final Logger LOGGER=LoggerFactory.getLogger(ProjectDetailsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjectDetailsApplication.class, args);
	}
	
	@GetMapping("/check")
	public String getLoggingData() {
		LOGGER.info("DATA FROM getData()");
		return "All the Details of the Project";
			
	}
	
	@PostMapping("/postDetail")
	public String postLoggingData() {
		LOGGER.info("DATA FROM postData()");
		return "Add the Details of the Project";
			
	}
	
	@DeleteMapping("/deleteDetail")
	public String deleteLoggingData() {
		LOGGER.info("DATA FROM deleteData()");
		return "Delete the Details of the Project";
			
	}
	
	@PutMapping("/updateDetail")
	public String putLoggingData() {
		LOGGER.info("DATA FROM putData()");
		return "Update the Details of the Project";
			
	}

}

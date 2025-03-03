package com.ttn.bootcamp.springboot_assignment;

import com.ttn.bootcamp.springboot_assignment.service.BootcampService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootAssignmentApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringbootAssignmentApplication.class, args);
		BootcampService bootcampService= context.getBean(BootcampService.class);
		// Q2) Confgure few properties under application properties file
		// and read there value under Main class.
		LOGGER.info(bootcampService.getBootcampDetails());
	}

}

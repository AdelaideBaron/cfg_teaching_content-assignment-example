package com.example.assignment_cfg_example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AssignmentCfgExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentCfgExampleApplication.class, args);
		log.warn("starting application");
	}

}

package com.purnima.jain.application.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ApplicationPropertiesReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPropertiesReaderApplication.class, args);
		log.info("Starting ApplicationPropertiesReaderApplication.......");
	}

}

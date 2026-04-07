package com.purnima.jain.application.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import com.purnima.jain.application.properties.config.ApplicationConfig;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class ApplicationPropertiesReaderApplicationRunner implements ApplicationRunner {

	@Autowired
	private ApplicationConfig applicationConfig;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String oracleHostname = applicationConfig.getOracle().getHostname();
		log.info("oracleHostname :: {}", oracleHostname);
		log.info("applicationConfig.getOracle() :: {}", applicationConfig.getOracle().toString());

		String postgresHostname = applicationConfig.getPostgres().getHostname();
		log.info("postgresHostname :: {}", postgresHostname);
		log.info("applicationConfig.getPostgres() :: {}", applicationConfig.getPostgres().toString());

	}
}
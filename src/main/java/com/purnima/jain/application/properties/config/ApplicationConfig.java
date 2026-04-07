package com.purnima.jain.application.properties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "db.source")
@Data
public class ApplicationConfig {

	private Oracle oracle;

	@Data
	public static class Oracle {
		String hostname;
		int port;
		String user;
		String pass;
		String database;
	}

	private Postgres postgres;

	@Data
	public static class Postgres {
		String hostname;
		int port;
		String user;
		String pass;
		String database;
	}

}

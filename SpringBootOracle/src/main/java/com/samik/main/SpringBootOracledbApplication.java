package com.samik.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.samik.*")
@ComponentScan(basePackages = { "com.samik.*" })
@EntityScan("com.samik.*")   
@SpringBootApplication
public class SpringBootOracledbApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOracledbApplication.class, args);
	}
}

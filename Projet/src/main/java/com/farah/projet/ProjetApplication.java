package com.farah.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.farah.projet")
@SpringBootApplication
public class ProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplication.class, args);
	}

}
 	
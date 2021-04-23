package com.startup.distsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DistributionSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributionSystemApplication.class, args);
	}

}

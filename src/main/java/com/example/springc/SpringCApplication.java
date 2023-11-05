package com.example.springc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCApplication.class, args);
	}

}

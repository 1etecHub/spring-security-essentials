package com.kokoro.springSecurityEssentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug = true)
public class SpringSecurityEssentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityEssentialsApplication.class, args);
	}

}

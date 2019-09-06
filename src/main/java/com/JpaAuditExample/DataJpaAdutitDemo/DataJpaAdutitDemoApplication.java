package com.JpaAuditExample.DataJpaAdutitDemo;

import com.JpaAuditExample.DataJpaAdutitDemo.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DataJpaAdutitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaAdutitDemoApplication.class, args);
	}
	@Bean
	public AuditorAware< User > auditorProvider() {
		return new MovieAuditorAware();
	}

}

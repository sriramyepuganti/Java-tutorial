package com.example.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.fe.Fe;
import com.example.be.Be;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.fe", "com.example.be"})
@EntityScan(basePackages = {"com.example.be"})
@EnableJpaRepositories(basePackages = {"com.example.be"})
public class SpringExampleApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringExampleApplication.class, args);
		context.getBean(Fe.class, args);
		context.getBean(Be.class, args);
	}

}

package com.abhi.boot.mybootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.abhi.boot.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages= {"com.abhi.boot"})
//@ComponentScan("com.abhi")
//@EntityScan("com.abhi")
public class MybootprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybootprojectApplication.class, args);
	}

}

package com.jenkins.jenkins1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkins1Application {
	
	 public Jenkins1Application() {
	        super(); // Appeler le constructeur de la classe parente (Object)
	    }
	

	public static void main(String[] args) {
		SpringApplication.run(Jenkins1Application.class, args);
	}

}

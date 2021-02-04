package com.hcl.loginproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplicationannotation does the magic work to start the embedded Tomcat server, 
//configure Spring Dispatcher Servlet
@SpringBootApplication
public class Loginproject2Application {

	public static void main(String[] args) {
		SpringApplication.run(Loginproject2Application.class, args);
	}

}

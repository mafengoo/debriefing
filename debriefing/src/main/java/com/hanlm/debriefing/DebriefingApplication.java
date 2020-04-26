package com.hanlm.debriefing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DebriefingApplication {
	public static void main(String[] args) {
		SpringApplication.run(DebriefingApplication.class, args);
	}
}

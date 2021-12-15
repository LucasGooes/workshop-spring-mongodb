package com.marinhosoftware.workshopspringmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableMongoRepositories(basePackages = "com.marinhosoftware.workshopspringmongo.repository")
@SpringBootApplication
public class WorkshopspringmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopspringmongoApplication.class, args);
	}

}

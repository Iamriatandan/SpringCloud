package com.tandan.DatabaseProject;

import com.tandan.DatabaseProject.model.Alien;
import com.tandan.DatabaseProject.repository.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DatabaseProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DatabaseProjectApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("java");

		AlienRepo repo = context.getBean(AlienRepo.class);

		repo.save(alien1);
		System.out.println(repo.findAll());

	}

}

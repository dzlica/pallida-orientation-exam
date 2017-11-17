package com.greenfox.dzlica.orientationexam;

import com.greenfox.dzlica.orientationexam.repositories.PlateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrientationexamApplication implements CommandLineRunner{

    @Autowired
    PlateRepo plateRepo;

	public static void main(String[] args) {
		SpringApplication.run(OrientationexamApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {

    }
}



package com.mohamedatta.schoolsoapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mohamedatta.school.schemas.students.StudentDetailsRequest;
import com.mohamedatta.school.schemas.students.StudentDetailsResponse;

@SpringBootApplication
public class SchoolSoapClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolSoapClientApplication.class, args);
	}
	
}

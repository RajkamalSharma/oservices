package com.oservices.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OServiceTestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OServiceTestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(OServiceTestApplication.class, args);
	}
}

@CrossOrigin(value = "*")
@RestController(value = "/")
class TestController{

	@RequestMapping(value = "test" , method=RequestMethod.GET , produces = "application/json")
								public Student addForm(){
		System.out.println("Inside addFor..");
		return new Student(13, "ArE");
	}
}


class Student{

    int id;
    String name;

    public Student(int id , String name){
    this.id = id;
    this.name = name;
    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
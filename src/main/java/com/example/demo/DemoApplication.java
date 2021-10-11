package com.example.demo;



import com.example.demo.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext cs= 
		SpringApplication.run(DemoApplication.class, args);
	//	student s3=cs.getBean(student.class);
		System.out.println("yu");
	}

	//student s2=  cs.getBean(student.class) ; 
	Student s1= new Student(2, "rt");
	

	
	// @GetMapping
	// public List<student> stu(){
	// 	return List.of(
	// 		new student(23, "ujj")
	// 	);
	// }

}

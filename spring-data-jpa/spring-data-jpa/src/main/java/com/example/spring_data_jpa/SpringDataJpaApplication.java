package com.example.spring_data_jpa;

import com.example.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollno(101);
//		s1.setName("Tanvi");
//		s1.setMarks(80);
//
//		s2.setRollno(102);
//		s2.setName("Neha");
//		s2.setMarks(90);
//
//		s3.setRollno(103);
//		s3.setName("Deepti");
//		s3.setMarks(100);

		//repo.save(s2);
		//repo.save(s3);

		//System.out.println(repo.findAll());

		//Optional<Student> s = repo.findById(104);
		//System.out.println(s.orElse(new Student()));
		//System.out.println(repo.findByName("Tanvi"));
		//System.out.println(repo.findByMarksGreaterThan(80));
		//repo.save(s2);
		//repo.delete(s3);


	}

}

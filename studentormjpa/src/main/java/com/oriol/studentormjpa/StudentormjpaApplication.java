package com.oriol.studentormjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.oriol.studentormjpa.model.Student;
import com.oriol.studentormjpa.repository.StudentRepo;

@SpringBootApplication
public class StudentormjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentormjpaApplication.class, args); 
		StudentRepo repo = context.getBean(StudentRepo.class);
		
		Student s1 = context.getBean(Student.class);
		// s1.setId(10);
		// s1.setName("Oriol");
		// s1.setMarks(100);
		// repo.save(s1);
		System.out.println(repo.findById(10));
		System.out.println(
			//repo.findByName("Oriol")
			repo.findByMarksGreaterThan(50)
		);
	}

}

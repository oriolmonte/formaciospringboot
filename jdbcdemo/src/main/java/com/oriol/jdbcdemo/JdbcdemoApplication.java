package com.oriol.jdbcdemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.oriol.jdbcdemo.model.Student;
import com.oriol.jdbcdemo.service.StudentService;

@SpringBootApplication
public class JdbcdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcdemoApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setId(105); 
		s.setName("Oriol");
		s.setMarks( 10);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> students = service.getStudents();
		System.out.println(students);
	}
}

package com.studentdata.backend;

import com.studentdata.backend.entity.Student;
import com.studentdata.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setName("Dhinesh");
		student.setDept("EEE");
		student.setEmail("dhinesh@gmai.com");
		studentRepository.save(student);

		Student student1 = new Student();
		student1.setName("Karthik");
		student1.setDept("ECE");
		student1.setEmail("karthik@gmai.com");
		studentRepository.save(student1);
	}

}

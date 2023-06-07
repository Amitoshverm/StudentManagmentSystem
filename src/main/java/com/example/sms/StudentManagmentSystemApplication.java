package com.example.sms;

import com.example.sms.Entity.Student;
import com.example.sms.Repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}



	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("ramesh", "chand verma", "ramesh@mail");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("suresh", "verma", "suresh@mail");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("swami dayal", "verma", "sd@mail");
//		studentRepository.save(student3);
	}
}

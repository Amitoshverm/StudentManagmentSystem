package com.example.sms.Service;

import com.example.sms.Entity.Student;
import com.example.sms.Repository.StudentRepository;

import java.util.List;

public interface StudentServices  {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}

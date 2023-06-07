package com.example.sms.Repository;

import com.example.sms.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}

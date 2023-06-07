package com.example.sms.Controller;

import com.example.sms.Entity.Student;
import com.example.sms.Service.StudentServiceImpl;
import com.example.sms.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentServiceImpl studentServices;



    @GetMapping("/students")
   public String getAllStudent(Model model) {
         model.addAttribute("student", studentServices.getAllStudents());
         return "students";
    }

//    @PostMapping("/")
//    public String createStudent(@RequestBody StudentDTO studentDTO, Model model) {
//        StudentDTO newStudent = this.studentServices.createStudent(studentDTO);
//        return "student created successfully !";
//    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Student student = new Student();  //create student object to hold student form data
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentServices.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentServices.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model) {

        // get student from database by id
        Student existingStudent = studentServices.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        // save updated student details

        studentServices.saveStudent(existingStudent);
        return "redirect:/students";
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable Long id){
        studentServices.deleteStudentById(id);
        return "redirect:/students";
    }
}

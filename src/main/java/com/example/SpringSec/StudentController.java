package com.example.SpringSec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "omar", 20),
            new Student(2, "aya", 20)

    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;

    }
    @PostMapping("/students")
    public  Student addstudent(@RequestBody Student student){

        students.add(student);
        return student;
    } 
    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");


    }

}

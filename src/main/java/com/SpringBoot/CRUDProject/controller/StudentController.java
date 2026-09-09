package com.SpringBoot.CRUDProject.controller;

import com.SpringBoot.CRUDProject.Service.StudentService;
import com.SpringBoot.CRUDProject.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public String  createStudent(@RequestBody Student student){

        Student createdStudent = studentService.createStudent();
        return "Student created";

    }


}

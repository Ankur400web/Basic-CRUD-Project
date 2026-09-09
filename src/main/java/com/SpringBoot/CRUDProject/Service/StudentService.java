package com.SpringBoot.CRUDProject.Service;


import com.SpringBoot.CRUDProject.entity.Student;
import com.SpringBoot.CRUDProject.repository.StudentRepository;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        Student student = studentRepository.save(studentReq);
        return student;

    }
}

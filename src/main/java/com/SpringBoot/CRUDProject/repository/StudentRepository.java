package com.SpringBoot.CRUDProject.repository;


import com.SpringBoot.CRUDProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<Student, Long> {


}

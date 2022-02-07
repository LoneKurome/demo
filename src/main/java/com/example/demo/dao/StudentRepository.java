package com.example.demo.dao;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student getByName(String name);
    Student getByFirstName(String firstName);


}

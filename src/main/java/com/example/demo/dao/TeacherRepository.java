package com.example.demo.dao;

import com.example.demo.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher getByName(String name);
    Teacher getByFirstName(String firstName);
}

package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import com.example.demo.domain.Student;
import com.example.demo.domain.Teacher;

@Entity
public class Classroom {
    @Id
    public String classroomID;

    @ManyToOne
    public ArrayList<Student> students = new ArrayList<Student>();
    @ManyToMany
    public ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    public Classroom(String classroomID){
        this.classroomID = classroomID;
    }

    public Classroom() {
    }

    //Getters
    public String getClassroomID() {return classroomID;}

    //Setters
    public void setClassroomID(String classroomID) {this.classroomID = classroomID;}

    //Add a Teacher to the classroom
    public void addTeacher(String classroomID, Teacher teacher) {
        teachers.add(teacher);
    }

    //Add a Student to the classroom
    public void addStudent(String classroomID, Student student) {
        students.add(student);
    }

    //Remove a Teacher to the classroom
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    //Remove a Student to the classroom
    public void removeStudent(String classroomID, Student student) {
        students.remove(student);
    }
}
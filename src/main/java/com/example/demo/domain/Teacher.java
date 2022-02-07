package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Teacher {
    public String name;
    public String firstName;
    public String subject;
    @Id
    public Long teacherID;

    public Teacher(String name, String firstName){
        this.name = Objects.requireNonNull(name);
        this.firstName = Objects.requireNonNull(firstName);
        this.subject = subject;
    }

    public Teacher() {

    }

    //Getters
    public String getName() {return name;}
    public String getFirstName() {return  firstName;}
    public String getSubject() {return subject;}

    //Setters
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setName(String name) {this.name = name;}
    public void setSubject(String subject) {this.subject = subject;}
}

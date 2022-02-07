package com.example.demo.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Student {
    public String name;
    public String firstName;
    public int age;
    @Id
    private Long studentID;


    public Student(String name, String firstName, int age){
        this.name = Objects.requireNonNull(name);
        this.firstName = Objects.requireNonNull(firstName);
        this.age = Objects.requireNonNull(age);
    }

    public Student() {

    }

    //Getters
    public String getName() {return name;}
    public String getFirstName() {return  firstName;}
    public int getAge() {return age;}

    //Setters
    public void setName(String name) {this.name = name;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setAge(int age) {this.age = age;}
}

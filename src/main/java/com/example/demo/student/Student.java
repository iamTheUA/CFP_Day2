package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    

    @Autowired
    School sc;
    private long id;
    private String name;

    
    public Student(){
        
    }

    public Student(long id, String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", sc=" + sc + "]";
    }
    
}

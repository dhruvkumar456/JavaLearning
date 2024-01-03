package com.example.springprojectgradle.student;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Component // This tells to spring framework that this is a bean, so that instance of this class can be injected to
// another class - To be more specific we can define @Service This is more specific & easy for understanding & readability
@Service // Java initialize this class as bean as well -> so that it can be instance of this class injected to another class
//@AllArgsConstructor // This will inject 'StudentRepository' object in this class
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return this.studentRepository.findAll();
    }
}
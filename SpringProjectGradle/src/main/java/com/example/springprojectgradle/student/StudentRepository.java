package com.example.springprojectgradle.student;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
//    Optional<Student> findBy --> after this press ctr + space to get all options

    // Behind the scenes Java will convert this into MongoDb query. 'Students.findOne({email: email})'.
    Optional<Student> findByEmail(String email);

//    @Query("") // Here we can define write our custom mongoDb query
//    void customQuery();
}

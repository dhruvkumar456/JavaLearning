package com.example.springproject.student;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * By default setter method is not present in intelliJ like constructor, getter in auto-generate.
 * For this we need to install Lambork plugin in intelliJ.
 */

/**
 * ANNOTATION is used to give metadata to compiler at the compile time
 * Some ANNOTATION works on methods, some on variables, some on class level etc.
 */

//@NoArgsConstructor --> This is an lambok annotation which will create a no arg constructor on compile time
//@AllArgsConstructor  This is an lambok annotation which will create a all arg constructor on compile time
@Data //--> This will set all constrcutor, getter, setter, toString etc
@Document // In order to tell that this class can be collection in mongoDb & we can store documents, we need to annotate this with Document
public class Student {

    @Id
    private String id;
    private final String name;
    @Indexed
    private final String email;
    private final Integer age;
//    private final LocalDate dob;
    //    @Getter @Setter --> This annotation is used by lambok, that will create getter & setter method for this field on compile time
}

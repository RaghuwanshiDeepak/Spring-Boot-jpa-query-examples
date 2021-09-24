package com.deepakraghuwansh.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "student", indexes = {
        @Index(name = "idx_student_id", columnList = "id")
})
public class Student extends BaseEntity {

    private String nameOfTheStudent;
    private int age;
    private String city;
    private int percentage;
}

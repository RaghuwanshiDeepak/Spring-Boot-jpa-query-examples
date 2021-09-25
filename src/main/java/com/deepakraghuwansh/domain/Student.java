package com.deepakraghuwansh.domain;

import com.deepakraghuwansh.enums.Branch;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student extends User {

    private String rollNo;
    private String admissionNo;
    @Enumerated(value = EnumType.STRING)
    private Branch branch;


}

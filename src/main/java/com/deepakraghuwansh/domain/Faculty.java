package com.deepakraghuwansh.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty extends User{

    private long startDate;

}

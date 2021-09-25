package com.deepakraghuwansh.domain;

import com.deepakraghuwansh.enums.Branch;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "classes")
@Getter
@Setter
public class Classes extends BaseEntity{

    private String roomNo;
    private Branch branch;
    private int semester;
    private int batchYear;
    @OneToOne
    private Faculty assignedFaculty;
}

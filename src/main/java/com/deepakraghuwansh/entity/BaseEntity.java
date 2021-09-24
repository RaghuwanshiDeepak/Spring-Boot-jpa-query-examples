package com.deepakraghuwansh.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long createdDate;
    private long updateDate;

    @PrePersist
    public void setCreatedDate() {
        this.createdDate = System.currentTimeMillis();
        this.updateDate = this.createdDate;
    }

    @PreUpdate
    public void setUpdateDate() {
        this.updateDate = System.currentTimeMillis();
    }
}

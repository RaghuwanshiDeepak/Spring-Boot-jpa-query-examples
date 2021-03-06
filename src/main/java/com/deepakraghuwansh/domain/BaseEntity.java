package com.deepakraghuwansh.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long createdDate;
    private boolean deleted;

    @PrePersist
    public void setCreatedDate() {
        this.createdDate = System.currentTimeMillis();
    }
}

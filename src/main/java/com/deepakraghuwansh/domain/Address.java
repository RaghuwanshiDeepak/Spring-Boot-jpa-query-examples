package com.deepakraghuwansh.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address extends BaseEntity {

    private String houseNo;
    private String street;
    private String city;
    private String district;
    private String state;
    private String country;
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "address")
    private List<User> user;
}

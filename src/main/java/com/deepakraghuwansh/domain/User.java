package com.deepakraghuwansh.domain;

import com.deepakraghuwansh.enums.Gender;
import com.deepakraghuwansh.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String mobile;
    private String email;
    private String dob;
    private String city;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne
    private Address address;
}

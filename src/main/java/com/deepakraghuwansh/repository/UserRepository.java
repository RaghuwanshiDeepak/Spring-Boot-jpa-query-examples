package com.deepakraghuwansh.repository;

import com.deepakraghuwansh.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(nativeQuery = true,value = "select * from user where username = ?1 and deleted = false")
    User findUserByUserName(String userName);
}
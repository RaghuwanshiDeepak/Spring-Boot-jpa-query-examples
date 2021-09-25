package com.deepakraghuwansh.service;

import com.deepakraghuwansh.domain.User;
import com.deepakraghuwansh.dto.LoginDto;
import com.deepakraghuwansh.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Object login(LoginDto loginDto){
        User userByUserName = userRepository.findUserByUserName(loginDto.getUserName());
        boolean matches = bCryptPasswordEncoder.matches(loginDto.getPassword(), userByUserName.getPassword());
        if(matches)
        {
            return
        }

    }



}

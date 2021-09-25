package com.deepakraghuwansh.controllers;

import com.deepakraghuwansh.dto.LoginDto;
import com.deepakraghuwansh.service.AuthenticationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
@AllArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<Object> userLogin(@RequestBody LoginDto loginDto){
     return
    }


}

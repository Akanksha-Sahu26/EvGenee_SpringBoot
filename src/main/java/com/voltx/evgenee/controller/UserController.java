package com.voltx.evgenee.controller;

import com.voltx.evgenee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/register")
    public ResponseEntity<?> registerUser(String obj) {
        String status = userService.register(obj);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}

package com.card.system.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Login Controller
 */
@RestController
@RequestMapping({"/"})
public class LoginController {


    @PostMapping("/login")
    public ResponseEntity<?> login()  {
        return new ResponseEntity(true, HttpStatus.OK
        );
    }

}

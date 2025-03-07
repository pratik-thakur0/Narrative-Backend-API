package com.narrative.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("/")
    public ResponseEntity<String> index(){
        return new ResponseEntity<>(
                "Index Page of Narrative",
                HttpStatus.OK
        );
    }
}

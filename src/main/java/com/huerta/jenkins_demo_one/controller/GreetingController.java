package com.huerta.jenkins_demo_one.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.huerta.jenkins_demo_one.dto.GreetingDTO;

@RestController
public class GreetingController {

    @GetMapping("/greeting/{name}")
    public ResponseEntity<GreetingDTO> greeting(@PathVariable String name) {
        final GreetingDTO greetingDTO = GreetingDTO.builder().message("Hello " + name + " welcome jenkins").build();
        return ResponseEntity.ok(greetingDTO);
    }
}
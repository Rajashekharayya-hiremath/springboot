package com.raja.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public String getAllStudents() {
        return "All Students Data (Secured)";
    }

    @GetMapping("/public")
    public String publicApi() {
        return "This is Public API";
    }
}
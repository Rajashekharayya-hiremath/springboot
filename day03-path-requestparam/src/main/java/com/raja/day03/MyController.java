package com.raja.day03;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/")
    public String home() {
        return "Day 3 - Working!";
    }

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id) {
        return "Product ID: " + id;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/student/{id}")
    public Student student(@PathVariable int id,
                           @RequestParam String name,
                           @RequestParam String branch) {
        return new Student(id, name, branch);
    }
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        return List.of(
                new Student(1, "Raj", "ECE"),
                new Student(2, "Amit", "CSE"),
                new Student(3, "Neha", "ME")
        );
    }
    
}
package com.raja.day03;

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
    public String student(@PathVariable int id,
                          @RequestParam String name,
                          @RequestParam String branch) {
        return "ID: " + id + ", Name: " + name + ", Branch: " + branch;
    }
}
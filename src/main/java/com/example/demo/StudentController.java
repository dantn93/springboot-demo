package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public String getStudents() {
        return "xin chao cac ban";
    }

    // Thêm các endpoint khác như POST, PUT, DELETE...
}
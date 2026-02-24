package com.ceg.hello.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.ceg.hello.domain.Student;
import com.ceg.hello.services.StudentService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequiredArgsConstructor
public class StudentController {

    @SuppressWarnings("unused")
    private final StudentService studentService;

    @GetMapping("/allstudents")
    public List<Student> all() {
        return studentService.all();
    }
}

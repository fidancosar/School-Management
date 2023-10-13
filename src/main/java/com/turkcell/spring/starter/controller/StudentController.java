package com.turkcell.spring.starter.controller;

import com.turkcell.spring.starter.model.request.StudentRequest;
import com.turkcell.spring.starter.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public ResponseEntity add(StudentRequest studentRequest){
        studentService.add(studentRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("Öğrenci Eklendi");


    }

}
package com.turkcell.spring.starter.controller;

import com.turkcell.spring.starter.entities.Teacher;
import com.turkcell.spring.starter.model.request.TeacherRequest;
import com.turkcell.spring.starter.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teachers")

public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public ResponseEntity add(TeacherRequest teacherRequest) {
        teacherService.add(teacherRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("öğretmen eklendi");


    }
}

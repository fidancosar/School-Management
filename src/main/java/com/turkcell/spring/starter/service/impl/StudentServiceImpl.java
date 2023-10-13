package com.turkcell.spring.starter.service.impl;

import com.turkcell.spring.starter.repositories.StudentRepository;
import com.turkcell.spring.starter.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

}

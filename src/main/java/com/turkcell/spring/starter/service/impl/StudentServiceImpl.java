package com.turkcell.spring.starter.service.impl;

import com.turkcell.spring.starter.entities.Student;
import com.turkcell.spring.starter.model.request.StudentRequest;
import com.turkcell.spring.starter.repositories.StudentRepository;
import com.turkcell.spring.starter.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
@Override
    public void add(StudentRequest student) {
        Student student1=new Student();
        student1.setStudentName(student.getStudentName());

        studentRepository.save(student1);

    }


}

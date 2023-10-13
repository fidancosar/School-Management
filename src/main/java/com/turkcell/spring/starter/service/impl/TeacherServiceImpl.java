package com.turkcell.spring.starter.service.impl;

import com.turkcell.spring.starter.entities.Teacher;
import com.turkcell.spring.starter.model.request.TeacherRequest;
import com.turkcell.spring.starter.repositories.TeacherRepository;
import com.turkcell.spring.starter.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void add(TeacherRequest teacher) {
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherName(teacher.getTeacherName());

        teacherRepository.save(teacher1);
    }
}

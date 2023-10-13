package com.turkcell.spring.starter.service.impl;

import com.turkcell.spring.starter.repositories.SchoolRepository;
import com.turkcell.spring.starter.service.SchoolService;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {
    private SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
}

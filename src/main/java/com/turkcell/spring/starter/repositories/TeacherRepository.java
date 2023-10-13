package com.turkcell.spring.starter.repositories;

import com.turkcell.spring.starter.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}

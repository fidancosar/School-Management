package com.turkcell.spring.starter.repositories;

import com.turkcell.spring.starter.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

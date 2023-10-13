package com.turkcell.spring.starter.repositories;

import com.turkcell.spring.starter.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}

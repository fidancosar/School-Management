package com.turkcell.spring.starter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "student")
public class Student {
    @GeneratedValue()
    @Id
    @Column (name = "student_id")
    private int studentId;
    @Column (name = "student_name")
    private String studentName;


    @ManyToOne
    @JoinColumn (name = "teacher_id")
    private Teacher teachers;

    @ManyToOne
    @JoinColumn (name = "school_id")
    private School schools;
}

package com.turkcell.spring.starter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "teacher")
public class Teacher {
    @GeneratedValue()
    @Id
    @Column (name = "teacher_id")
    private int teacherId;
    @Column (name = "teacher_name")
    private String teacherName;

    @OneToMany (mappedBy = "teachers")
    List<Student> students = new ArrayList<>();

    @ManyToOne
    @JoinColumn (name = "school_id")
    private School schools;

}

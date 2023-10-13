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
@Table(name = "school")
public class School {
    @GeneratedValue()
    @Id
    @Column (name = "school_id")
    private int schoolId;
    @Column (name = "school_name")
    private String schoolName;


    @OneToMany (mappedBy = "schools")
    List<Teacher> teachers= new ArrayList<>();
    @OneToMany (mappedBy = "schools")
    List<Student> students= new ArrayList<>();
    @OneToMany (mappedBy = "schools")
    List<OtherPersonel> otherpersonels= new ArrayList<>();
}

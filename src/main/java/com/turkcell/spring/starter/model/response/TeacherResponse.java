package com.turkcell.spring.starter.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherResponse {
    private int teacherId;
    private String teacherName;
}

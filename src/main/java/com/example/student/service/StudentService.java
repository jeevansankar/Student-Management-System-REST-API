package com.example.student.service;

import com.example.student.entity.StudentEnty;
import java.util.List;
public interface StudentService {


    StudentEnty createstudent(StudentEnty student);
    StudentEnty getStudentById(Long id);
    StudentEnty updateStudent(Long id, StudentEnty student);
    void deleteStudent(Long id);
    List<StudentEnty> getAll();


}
    
package com.example.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.student.entity.StudentEnty;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    // Constructor Injection (Best Practice)
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // CREATE
    @PostMapping
    public StudentEnty createStudent(@RequestBody StudentEnty student) {
        return studentService.createstudent(student);
    }

    // GET BY ID
    @GetMapping("/{id}")
    public StudentEnty getStudent(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public StudentEnty updateStudent(@PathVariable Long id,
                                     @RequestBody StudentEnty student) {
        return studentService.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }
//all annotation 
    // GET ALL
    @GetMapping
    public List<StudentEnty> getAllStudents() {
        return studentService.getAll();
    }
}
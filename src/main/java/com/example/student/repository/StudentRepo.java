package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entity.StudentEnty;


public interface StudentRepo extends JpaRepository<StudentEnty, Long> {
}

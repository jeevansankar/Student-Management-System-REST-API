package com.example.student.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor  
@Entity
@Table(name = "students")
public class StudentEnty{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

     @Column(unique = true, nullable = false)
    private String email;   
    @Column(unique = true, nullable = false)
    private String phone_no;
    private LocalDate date_of_birth;
    private String gender;
    private Integer age;
    private Integer year_of_study;
}

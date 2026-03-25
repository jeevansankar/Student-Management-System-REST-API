package com.example.student.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.student.entity.StudentEnty;
import com.example.student.repository.StudentRepo;




@Service
public class StudentServiceImpl implements StudentService {

 private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;

    }
    @Override
    public StudentEnty createstudent(StudentEnty student) {
        //create a new student
        studentRepo.save(student);
        return student;
    }

    @Override
    public StudentEnty getStudentById(Long id) {
        //get the student by id
        
        return studentRepo.findById(id).orElse(null);   
    }
     @Override
    public StudentEnty updateStudent(Long id, StudentEnty student) {
        student.setId(id);
        return studentRepo.save(student);
    }
  

    @Override
    public void deleteStudent(Long id) {
        //delete the student 
        studentRepo.deleteById(id); 
       
    }

    @Override
    public List<StudentEnty> getAll() {
//get all the students
        return studentRepo.findAll();

    }
    
}

package com.vijay.controller;

import com.vijay.models.Student;
import com.vijay.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController
{
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/saveStudent")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student save = this.studentRepository.save(student);
        return  ResponseEntity.ok(save);
    }
    @GetMapping("/getStudent")
    public  ResponseEntity<?> getStudents()
    {
        return  ResponseEntity.ok(this.studentRepository.findAll());
    }
}

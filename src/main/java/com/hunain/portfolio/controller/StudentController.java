package com.hunain.portfolio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hunain.portfolio.model.*;
import com.hunain.portfolio.services.StudentRepository;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/students")
    public List<Student> listAll() {
        List<Student> listStudents = studentRepo.findAll();
        return listStudents;
    }

    @PostMapping("/students")
    public void save(@RequestBody Student student){
        studentRepo.save(student);
    }
}

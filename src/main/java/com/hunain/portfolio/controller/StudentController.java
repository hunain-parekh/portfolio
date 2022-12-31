package com.hunain.portfolio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hunain.portfolio.model.*;
import com.hunain.portfolio.services.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/students")
    public List<Student> listAll() {
        List<Student> listStudents = studentRepo.findAll();
        return listStudents;
    }

    @GetMapping("/students/{stu_id}")
    public Student getStudentById(@PathVariable Integer stu_id) {
        Student student = studentRepo.findById(stu_id).orElseThrow();
        return student;
    }

    @PostMapping("/students")
    public void save(@RequestBody Student student){
        studentRepo.save(student);
    }
}

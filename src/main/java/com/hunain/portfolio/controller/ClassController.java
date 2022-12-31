package com.hunain.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hunain.portfolio.model.Class;
import com.hunain.portfolio.services.ClassRepository;

@RestController
@RequestMapping("/api")
public class ClassController {
    @Autowired
    private ClassRepository classRepo;

    @GetMapping("/classes")
    public List<Class> listAll() {
        List<Class> listClasses = classRepo.findAll();
        return listClasses;
    }

    @PostMapping("/classes")
    public void save(@RequestBody Class class1){
        classRepo.save(class1);
    }

    @GetMapping("/classes/{class_id}")
    public Class getByClassId(@PathVariable Integer class_id){
        return classRepo.findById(class_id).orElse(null);
    }

    @GetMapping("/students/{student_id}/classes")
    public List<Class> getByStudentId(@PathVariable Integer student_id){
        return classRepo.findByStudentId(student_id);
    }
}

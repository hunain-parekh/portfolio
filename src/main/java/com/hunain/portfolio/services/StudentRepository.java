package com.hunain.portfolio.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hunain.portfolio.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}

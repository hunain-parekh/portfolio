package com.hunain.portfolio.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hunain.portfolio.model.Class;
import com.hunain.portfolio.model.Student;

public interface ClassRepository extends JpaRepository<Class, Integer>{

    List<Class> findByStudent(Student student);
}

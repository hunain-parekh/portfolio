package com.hunain.portfolio.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hunain.portfolio.model.Class;

public interface ClassRepository extends JpaRepository<Class, Integer>{

    List<Class> findByStudentId(Integer student_id);
}

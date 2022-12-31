package com.hunain.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "classes")
@Getter
@Setter
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String semester_taken;
    private String grade;

    @ManyToOne
    @JoinColumn(name="student_id",referencedColumnName="id")
    private Student student;
}

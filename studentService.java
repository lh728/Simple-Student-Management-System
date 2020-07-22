package com.example.service;

import com.example.entity.Student;
import com.example.entity.Student2;

import java.util.List;


public interface StudentService {
    boolean add(Student2 student2);
    List<Student> findAll();


    Student findById(Integer id);
    Student modify(Student student);
    void deleteById(Integer id);

}

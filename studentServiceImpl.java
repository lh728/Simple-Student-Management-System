package com.example.service;

import com.example.dao.StudentDao;
import com.example.entity.Student;
import com.example.entity.Student2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll(){
        return studentDao.findAll();
    }
    @Override
    public boolean add(Student2 student2){
        Student student = new Student();
        BeanUtils.copyProperties(student2,student);
        System.out.println(student.toString());
        studentDao.save(student);
        return true;
    }
    @Override
    public Student findById(Integer id){

        Optional<Student> opt = studentDao.findById(id);
        return opt.get();
    }
    @Override
    public Student modify(Student student){
        return studentDao.save(student);
    }
    @Override
    public void deleteById(Integer id){
        studentDao.deleteById(id);
    }

}

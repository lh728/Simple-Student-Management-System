package com.example.controller;


import com.example.entity.Student;
import com.example.entity.Student2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class StudentController {
    @Autowired
    private com.example.service.StudentService studentService;
    @RequestMapping("/Student")
    public String toAddStudent(Model model){
        List<Student> saveStudent=studentService.findAll();
        model.addAttribute("saveStudent",saveStudent);
        return "/Student";
    }
    //查询所有学生
    @PostMapping("/Student/List")
    @ResponseBody
    public List<Student> findAll(){
        return studentService.findAll();
    }
    //根据ID查询学生
    @PostMapping("Student/List/{id}")
    @ResponseBody
    public Student findById(@PathVariable("id") Integer id) {
        return studentService.findById(id);
    }

    //根据ID修改信息
    @GetMapping("modify/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id,Model model) {
        model.addAttribute("student",studentService.findById(id));
        return new ModelAndView("/modify","model",model);
    }

    @GetMapping("/modify")
    @ResponseBody
    public Student modify(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("sex")String sex,@RequestParam("age")int age){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);
        return studentService.modify(student);

    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Integer id){
        studentService.deleteById(id);
        return  new ModelAndView("redirect:/Student");


    }
    @RequestMapping("/addSuccess")
    public String saveStudent(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("sex")String sex,@RequestParam("age")int age){
        Student2 student2 = new Student2();
        student2.setId(id);
        student2.setSex(sex);
        student2.setName(name);
        student2.setAge(age);
        studentService.add(student2);
        return "/addSuccess";
    }

}

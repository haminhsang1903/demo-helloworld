package com.example.demo.controllers;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    StudentService studentService;
    @GetMapping("/hello")
    public String hello(){
        return "Hello Here";
    }
    @GetMapping("getAll")
    public List<Student> getAll(){
        return studentService.getAllStudent();
    }
    @PostMapping("add")
    public void add(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable String id){
        studentService.deleteStudent(id);
    }
}

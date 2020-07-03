package com.example.demo.controllers;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> list = new ArrayList<>(Arrays.asList(new Student("Sang","Dong Thap",20),
                                                              new Student("Thanh","Soc Trang",19)));
    public List<Student> getAllStudent(){
        return list;
    }
    public void addStudent(Student student){
         list.add(student);
    }
    public void deleteStudent(String id){
        list.removeIf(t -> t.getName().equals(id));
    }

}

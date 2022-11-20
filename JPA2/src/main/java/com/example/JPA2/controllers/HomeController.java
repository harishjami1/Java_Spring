package com.example.JPA2.controllers;

import java.util.List;
import com.example.JPA2.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA2.dao.StudentRepo;


@RestController
public class HomeController {
    @Autowired
    StudentRepo repo;
    @GetMapping("/students")
    public List<Student> getStudents()
    {   System.out.println(repo.findAll());
        return repo.findAll();
    }
    @GetMapping("/dept/{id}")
    public List<Student> getByDept( @PathVariable Integer id){
       
        return repo.getByDeptId(id);
    }
    @GetMapping("/")
    public String get()
    {
        return "Hi! Welcome";
    }
    
}

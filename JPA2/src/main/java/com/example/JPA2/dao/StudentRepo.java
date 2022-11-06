package com.example.JPA2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.JPA2.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
    String findById = null;

    @Query("select s from Student s where DEPARTMENT_DID=?1")
    List<Student> getByDeptId(Integer id);
}

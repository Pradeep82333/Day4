package com.example.demo.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
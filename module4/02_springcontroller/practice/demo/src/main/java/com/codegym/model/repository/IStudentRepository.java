package com.codegym.model.repository;

import com.codegym.model.bean.Student;

import java.util.List;

public interface IStudentRepository {
public void save(Student student);
public List<Student> findAll();
public Student findById(Integer id);
}

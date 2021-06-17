package com.codegym.service.Impl;

import com.codegym.model.bean.Student;

import java.util.List;

public interface IStudentService {
    public void save(Student student);
    public List<Student> findAll();
    public Student findById(Integer id);
}

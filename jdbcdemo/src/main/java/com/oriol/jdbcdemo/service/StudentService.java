package com.oriol.jdbcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oriol.jdbcdemo.dao.StudentDao;
import com.oriol.jdbcdemo.model.Student;

@Service
public class StudentService {

    private StudentDao dao;
    public StudentDao getDao() {
        return dao;
    }
    @Autowired
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }
    public void addStudent(Student s) {
        dao.save(s);
    }
    public List<Student> getStudents() {
        return dao.findAll();
    }
}

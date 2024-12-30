package com.oriol.studentormjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.oriol.studentormjpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);
    List<Student> findByMarksGreaterThan(int marks);

}

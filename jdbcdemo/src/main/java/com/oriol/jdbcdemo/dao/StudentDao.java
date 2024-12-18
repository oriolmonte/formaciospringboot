package com.oriol.jdbcdemo.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.oriol.jdbcdemo.model.Student;

@Repository
public class StudentDao {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql = "INSERT INTO STUDENT (ID,NAME,MARKS) VALUES (?,?,?)";
        int rows = jdbc.update(sql, s.getId(),s.getName(),s.getMarks());
        System.out.println(rows + "Affected");
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM STUDENT;";
        RowMapper<Student> mapper = (ResultSet rs, int rowNum) ->
        {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        };
        return jdbc.query(sql,mapper);
    }

    
}

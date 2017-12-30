package com.hand.home.dao;

import com.hand.home.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl<T extends Student> implements StudentDao<T> {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDaoImpl(DriverManagerDataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean insert(Student student) {
            String sqlInsert = "INSERT INTO student (name, age) VALUES (?, ?)";
            jdbcTemplate.update(sqlInsert, student.getName(), student.getAge());
            return true;
    }

    // TODO 干点啥
    @Override
    public boolean batchInsert(List<Object> obj) {
        return false;
    }

    // FIXME 修一下
    @Override
    public boolean update(Object obj) {
        return false;
    }

    @Override
    public boolean update(Map<String, Object> entry) {
        return false;
    }

    @Override
    public boolean batchUpdate(List<Object> list) {
        return false;
    }

    @Override
    public List<Map<String, Object>> queryForList(Map<String, Object> entry) {
        return null;
    }

    @Override
    public boolean delete(Object obj) {
        return false;
    }

    @Override
    public boolean delete(Map<String, Object> entry) {
        return false;
    }

    @Override
    public boolean batchDelete(List<Object> list) {
        return false;
    }
}

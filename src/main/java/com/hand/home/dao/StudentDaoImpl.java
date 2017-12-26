package com.hand.home.dao;

import com.hand.home.pojo.Student;
import com.hand.utils.DBConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {
    private DBConnect dbConect;

    @Autowired
    public StudentDaoImpl(DBConnect dbConnect) {
        this.dbConect = dbConnect;
    }

    @Override
    public boolean insert(Object obj) {
        try{
            Student student = (Student) obj;
            String sqlInsert = "INSERT INTO student (name, age) VALUES (?, ?)";
            dbConect.update(sqlInsert, student.getName(), student.getAge());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

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

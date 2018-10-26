package com.hand.home.dao;

import com.hand.home.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl<T extends Student> extends SqlSessionDaoSupport implements StudentDao<T> {
//    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    public StudentDaoImpl(DriverManagerDataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }

//    @Override
//    public boolean insert(T student) {
//            String sqlInsert = "INSERT INTO student (name, age) VALUES (?, ?)";
//            jdbcTemplate.update(sqlInsert, student.getName(), student.getAge());
//            return true;
//    }


    // Mybatis原生需要注入SqlSessionFactory
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    // Mybatis原生Dao方式，关联文件Student.xml
    @Override
    public boolean insert(T student) {
        SqlSession sqlSession = this.getSqlSession();
        // String参数为xml的：命名空间.statementId
        sqlSession.insert("test.insert", student);
        return true;
    }

    // TODO 干点啥
    @Override
    public boolean batchInsert(List<T> obj) {
        return false;
    }

    // FIXME 修一下
    @Override
    public boolean update(T obj) {
        return false;
    }

    @Override
    public boolean update(Map<String, T> entry) {
        return false;
    }

    @Override
    public boolean batchUpdate(List<T> list) {
        return false;
    }

    @Override
    public List<Map<String, T>> queryForList(Map<String, T> entry) {
        return null;
    }

    @Override
    public boolean delete(T obj) {
        return false;
    }

    @Override
    public boolean delete(Map<String, T> entry) {
        return false;
    }

    @Override
    public boolean batchDelete(List<T> list) {
        return false;
    }
}

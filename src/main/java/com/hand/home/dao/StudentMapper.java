package com.hand.home.dao;


import com.hand.home.pojo.Student;
import org.apache.ibatis.annotations.Insert;

public interface StudentMapper {

    // xml映射文件方式，对应文件为：studentMapper.xml
    public Student getStudentByAge(int age);


    // Mybatis注解方式，与xml无关
    @Insert("INSERT INTO student (name, age) VALUES (#{name}, #{age})")
    public void insertStudent(Student student);
}

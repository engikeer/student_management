package com.hand.home.dao;

import com.hand.home.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao<T extends Student> extends BaseDao<T> {

}

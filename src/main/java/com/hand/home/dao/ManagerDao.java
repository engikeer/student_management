package com.hand.home.dao;

import com.hand.home.pojo.Manager;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerDao<T extends Manager> extends BaseDao<T>{
}

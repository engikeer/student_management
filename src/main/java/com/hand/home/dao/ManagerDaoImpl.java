package com.hand.home.dao;

import com.hand.home.pojo.Manager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ManagerDaoImpl<T extends Manager> implements ManagerDao<T> {

    @Override
    public boolean insert(T obj) {
        return false;
    }

    @Override
    public boolean batchInsert(List<T> obj) {
        return false;
    }

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

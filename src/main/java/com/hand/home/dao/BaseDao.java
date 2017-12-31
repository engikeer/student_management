package com.hand.home.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseDao<T> {

    public boolean insert(T obj);
    public boolean batchInsert(List<T> obj);
    public boolean update(T obj);
    public boolean update(Map<String, T> entry);
    public boolean batchUpdate(List<T> list);
    public List<Map<String, T>> queryForList(Map<String, T> entry);
    public boolean delete(T obj);
    public boolean delete(Map<String, T> entry);
    public boolean batchDelete(List<T> list);

}
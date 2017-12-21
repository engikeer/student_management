package com.hand.home.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDao {

    public boolean insert(Object obj);
    public boolean batchInsert(List<Object> obj);
    public boolean update(Object obj);
    public boolean update(Map<String, Object> entry);
    public boolean batchUpdate(List<Object> list);
    public List<Map<String, Object>> queryForList(Map<String, Object> entry);
    public boolean delete(Object obj);
    public boolean delete(Map<String, Object> entry);
    public boolean batchDelete(List<Object> list);

}
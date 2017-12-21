package com.hand.utils;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DBConnect {
    private JdbcTemplate jdbcTemplate;

    public DBConnect(){
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("org.sqlite.JDBC");
            dataSource.setUrl("jdbc:sqlite:data/demo.db");
            this.jdbcTemplate = new JdbcTemplate(dataSource);
        }

    // 执行DDL和删除条目
    public void execute(String sql) throws SQLException{
        jdbcTemplate.execute(sql);
    }

    // 新增和修改条目
    public int update(String sql, Object... args) throws SQLException {
        return jdbcTemplate.update(sql, args);
    }

    // 批处理新增和修改条目
    public int[] batchUpdate(String sql) throws SQLException {
        return jdbcTemplate.batchUpdate(sql);
    }

    // 查询条目
    public List<Map<String, Object>> queryForList(String sql) throws SQLException {
        return jdbcTemplate.queryForList(sql);
    }


}

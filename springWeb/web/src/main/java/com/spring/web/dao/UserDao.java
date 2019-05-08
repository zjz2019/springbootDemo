package com.spring.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface UserDao {
    int updateInfo(String sql);
    int insertSql(String sql);
    List<Object> querySql(String sql);
    int deleteSql(String sql);
}

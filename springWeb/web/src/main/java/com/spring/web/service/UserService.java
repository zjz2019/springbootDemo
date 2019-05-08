package com.spring.web.service;

import java.util.List;

public interface UserService {
    int updateInfo(String sql);
    int insertSql(String sql);
    List<Object> querySql(String sql);
    int deleteSql(String sql);
}

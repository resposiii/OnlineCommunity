package com.nenu.dao;

import com.nenu.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    //登录
    User u_login (@Param("username") String username,@Param("password") String password);
}

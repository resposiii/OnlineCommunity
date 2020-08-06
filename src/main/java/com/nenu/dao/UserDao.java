package com.nenu.dao;

import com.nenu.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //登录
    User u_login (@Param("username") String username,@Param("password") String password);

    //注册
    void u_register(User user);

    //更新
    void u_update(User user);

    //删除
    void u_delete(int uid);

    //查找所有
    List<User> findAll();

    //根据姓名查找
    List<User> findByName(String username);
}

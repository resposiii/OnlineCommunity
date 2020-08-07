package com.nenu.dao;

import com.nenu.domain.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {
    //登录
    Admin a_login (@Param("a_name") String a_name, @Param("a_password") String a_password);

    //注册
    void a_register(Admin admin);
}

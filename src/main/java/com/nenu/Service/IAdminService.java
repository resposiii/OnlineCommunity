package com.nenu.Service;


import com.nenu.domain.Admin;

public interface IAdminService {
    //登录
    Admin a_login(String a_name, String a_password);
    //注册
    void a_register(Admin admin);
}

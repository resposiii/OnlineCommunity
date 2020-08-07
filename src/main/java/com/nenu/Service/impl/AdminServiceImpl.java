package com.nenu.Service.impl;

import com.nenu.Service.IAdminService;
import com.nenu.dao.AdminDao;
import com.nenu.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin a_login(String a_name, String a_password) {
        return adminDao.a_login(a_name,a_password);
    }

    @Override
    public void a_register(Admin admin) {
        adminDao.a_register(admin);
    }
}

package com.nenu.Service.impl;

import com.nenu.Service.IUserService;
import com.nenu.dao.UserDao;
import com.nenu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User u_login(String username, String password) {
        return userDao.u_login(username,password);
    }
}

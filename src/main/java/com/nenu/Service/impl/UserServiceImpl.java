package com.nenu.Service.impl;

import com.nenu.Service.IUserService;
import com.nenu.dao.UserDao;
import com.nenu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User u_login(String username, String password) {
        return userDao.u_login(username,password);
    }

    @Override
    public void u_register(User user) {
        userDao.u_register(user);
    }

    @Override
    public void u_update(User user) {
        userDao.u_update(user);
    }

    @Override
    public void u_delete(int uid) {
        userDao.u_delete(uid);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> findByName(String username) {
        return userDao.findByName(username);
    }
}

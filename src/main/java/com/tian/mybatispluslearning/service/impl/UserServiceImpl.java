package com.tian.mybatispluslearning.service.impl;

import com.tian.mybatispluslearning.dao.UserBaseDao;
import com.tian.mybatispluslearning.entity.User;
import com.tian.mybatispluslearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package: com.tian.mybatispluslearning.service.impl
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/7 8:38
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserBaseDao userBaseDao;

    /**
     * list all
     * @return
     */
    @Override
    public List<User> list() {
        return userBaseDao.selectList(null);
    }

    @Override
    public User select(int id) {
        return userBaseDao.selectById(id);
    }

    @Override
    public int delete(int id) {
        return userBaseDao.deleteById(id);
    }

    @Override
    public int add(User user) {
        return userBaseDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userBaseDao.updateById(user);
    }
}

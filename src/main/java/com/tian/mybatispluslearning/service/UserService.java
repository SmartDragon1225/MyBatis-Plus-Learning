package com.tian.mybatispluslearning.service;

import com.tian.mybatispluslearning.entity.User;

import java.util.List;

/**
 * Package: com.tian.mybatispluslearning.service
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/7 8:37
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
public interface UserService {

    List<User> list();

    User select(int id);

    int delete(int id);

    int add(User user);

    int update(User user);
}

package com.tian.mybatispluslearning.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tian.mybatispluslearning.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Package: com.tian.mybatispluslearning.dao
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/7 8:27
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Mapper
//Mybatis-plus is Framework how we can easy
public interface UserBaseDao extends BaseMapper<User> {
    /**
     * mybatis-plus练习
     */
}

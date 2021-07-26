package com.tian.mybatispluslearning;

import com.tian.mybatispluslearning.dao.UserBaseDao;
import com.tian.mybatispluslearning.entity.User;
import com.tian.mybatispluslearning.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyBatisPlusLearningApplicationTests {

    @Autowired
    UserBaseDao userBaseDao;

    @Autowired
    UserService userService;

    /**
     * listall
     */
    @Test
    void contextLoads() {
        List<User> list = userBaseDao.selectList(null);
        list.forEach(System.out::println);
    }

    /**
     * insert
     */
    @Test
    void insert_test(){
        User user = new User(4,"XL","123456");
        userBaseDao.insert(user);
        List<User> list = userBaseDao.selectList(null);
        list.forEach(System.out::println);
    }

    /**
     * delete
     * @param id
     */
    @Test
    void delete_test(int id){
        userBaseDao.deleteById(id);
        List<User> list = userBaseDao.selectList(null);
        list.forEach(System.out::println);
    }

    /**
     * update
     * @param user
     */
    @Test
    void update(User user){
        userBaseDao.updateById(user);
        List<User> list = userBaseDao.selectList(null);
        list.forEach(System.out::println);
    }

    /**
     * selectById
     * @param id
     */
    @Test
    void select_test(int id){
        User user = userBaseDao.selectById(id);
        System.out.println(user);
    }
}



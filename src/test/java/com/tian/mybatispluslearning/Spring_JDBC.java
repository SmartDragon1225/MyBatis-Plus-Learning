package com.tian.mybatispluslearning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * Package: com.tian.mybatispluslearning
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/7 19:55
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@SpringBootTest
public class Spring_JDBC {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void select(){
        String sql = "select * from user where id = 2";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps);
    }

    @Test
    public void list(){
        String sql = "select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        maps.forEach(System.out::println);
    }

    @Test
    public void delete(){
        String sql = "delete from user where id = 2";
        jdbcTemplate.update(sql);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        maps.forEach(System.out::println);
    }

    @Test
    public void update(){
        String sql = "update user set username = 新用户,password = 123456 where id = 2";
        jdbcTemplate.update(sql);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        maps.forEach(System.out::println);
    }

    @Test
    public void add(){
        String sql = "insert into user value(7,丰富，panzer)";
        jdbcTemplate.update(sql);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        maps.forEach(System.out::println);
    }


}

package com.tian.mybatispluslearning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.transaction.annotation.Transactional;

/**
 * Package: com.tian.mybatispluslearning.pojo
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/7 8:25
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Transactional
public class User {
    private int id;
    private String username;
    private String password;
}

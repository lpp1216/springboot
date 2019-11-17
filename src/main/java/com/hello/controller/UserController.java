/*
 * 文件名：HelloController.java
 * 版权：Copyright by lipingping
 * 描述：
 * 修改人：lpp
 * 修改时间：2019年11月17日
 */

package com.hello.controller;


import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.model.Resource;
import com.hello.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private Resource resource;
    
    
    @RequestMapping("/index")
    public User index() {
        User user = new User();
        user.setName("lipp我er");
        user.setPassword("123456");
        user.setAge(24);
        user.setBirthday(new Date());
        return user;
    }
    
    //资源中的属性配置映射到实体类
    @RequestMapping("getResource")
    public Resource getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return bean;
        
        
    }
    
}

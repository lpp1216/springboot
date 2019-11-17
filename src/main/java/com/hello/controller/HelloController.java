/*
 * 文件名：HelloController.java
 * 版权：Copyright by lipingping
 * 描述：
 * 修改人：lpp
 * 修改时间：2019年11月17日
 */

package com.hello.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/hello/{myName}")  
    public String index(@PathVariable String myName) {  
        return "Hello "+myName+"!!!";  
    }
}

/*
 * 文件名：User.java
 * 版权：Copyright by lipingping
 * 描述：
 * 修改人：lpp
 * 修改时间：2019年11月17日
 */

package com.hello.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {
    
    public String name;
    @JsonIgnore
    public String password;
    
    public Integer age;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:m:ss a", locale = "zh", timezone = "GMT+8")
    public Date birthday;
    
    @JsonInclude(Include.NON_NULL)
    public String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
}

/*
 * 文件名：Resource.java
 * 版权：Copyright by lipingping
 * 描述：
 * 修改人：lpp
 * 修改时间：2019年11月17日
 */

package com.hello.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="com.hello.opensource")
@PropertySource(value="classpath:resource.properties")
public class Resource {
    private String name;
    private String website;
    private String language;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}

package com.qs.mybatis_0223.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2023-02-23 09:14:16
 */
public class User implements Serializable {
    private static final long serialVersionUID = -65728358777850269L;
    
    private String username;
    
    private String password;
    
    private String regtime;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

}


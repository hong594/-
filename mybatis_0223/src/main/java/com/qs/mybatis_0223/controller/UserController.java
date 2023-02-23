package com.qs.mybatis_0223.controller;


import com.qs.mybatis_0223.entity.User;
import com.qs.mybatis_0223.service.UserService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2023-02-23 09:14:13
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;


    //添加
    @RequestMapping("/add")
    public ResponseEntity<User> add(User user){
        userService.save(user);//添加
        return ResponseEntity.ok(user);
    }


    //删除
    @RequestMapping("/del/{id}")
    public ResponseEntity<User> del(@PathVariable Long id){
        userService.removeById(id);//删除
        return ResponseEntity.ok(null);
    }

}



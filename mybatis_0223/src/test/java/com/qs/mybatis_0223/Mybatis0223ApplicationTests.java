package com.qs.mybatis_0223;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qs.mybatis_0223.dao.UserDao;
import com.qs.mybatis_0223.entity.User;
import com.qs.mybatis_0223.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mybatis0223ApplicationTests {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    //测试持久层方法 调用
    @Test
    void contextLoads() {
        System.out.println(userDao.selectList(null));
    }

    //测试业务层方法 调用
    @Test
    void contextLoads2() {
        System.out.println(userService.list(null));
    }

    //调用一下带条件的查询，就从持久层查找
    @Test
    void contextLoads3(){
        //条件构造器
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("username",12121);//where tid = 2
        wrapper.eq("password",12121);//and tname="Jack"
        System.out.println(userDao.selectList(wrapper));//将上面的条件放入
    }

}

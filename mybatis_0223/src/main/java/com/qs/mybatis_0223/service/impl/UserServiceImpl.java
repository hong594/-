package com.qs.mybatis_0223.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qs.mybatis_0223.entity.User;
import com.qs.mybatis_0223.dao.UserDao;
import com.qs.mybatis_0223.service.UserService;
import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-02-23 09:14:17
 */
@Service("userService")
public class  UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {
//    @Resource
//    private UserDao userDao;
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param username 主键
//     * @return 实例对象
//     */
//    @Override
//    public User queryById(String username) {
//        return this.userDao.queryById(username);
//    }
//
//    /**
//     * 分页查询
//     *
//     * @param user 筛选条件
//     * @param pageRequest      分页对象
//     * @return 查询结果
//     */
//    @Override
//    public Page<User> queryByPage(User user, PageRequest pageRequest) {
//        long total = this.userDao.count(user);
//        return new PageImpl<>(this.userDao.queryAllByLimit(user, pageRequest), pageRequest, total);
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param user 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public User insert(User user) {
//        this.userDao.insert(user);
//        return user;
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param user 实例对象
//     * @return 实例对象
//     */
//    @Override
//    public User update(User user) {
//        this.userDao.update(user);
//        return this.queryById(user.getUsername());
//    }
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param username 主键
//     * @return 是否成功
//     */
//    @Override
//    public boolean deleteById(String username) {
//        return this.userDao.deleteById(username) > 0;
//    }
}

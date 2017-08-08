package com.xsz.service.impl;

import com.xsz.dao.UserEntityMapper;
import com.xsz.model.UserEntity;
import com.xsz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liujinliang on 2017/8/7.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserEntityMapper userDao;

    @Override
    public UserEntity getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}

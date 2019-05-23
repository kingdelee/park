package com.yfkj.park.service.impl;

import com.yfkj.park.common.service.SuperService;
import com.yfkj.park.common.service.impl.SuperServiceImpl;
import com.yfkj.park.dao.UserMapper;
import com.yfkj.park.domain.entity.User;
import com.yfkj.park.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: UserServiceImpl
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-23 15:46
 * @Modified By: Who(When)
 * @Version v1.0
 **/
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(null);
    }
}

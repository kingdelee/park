package com.yfkj.park.service;


import com.yfkj.park.common.service.SuperService;
import com.yfkj.park.domain.entity.User;

import java.util.List;

/**
 * @Title: UserService
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-23 15:46
 * @Modified By: Who(When)
 * @Version v1.0
 **/
public interface UserService extends SuperService<User> {

    List<User> getUserList();

}

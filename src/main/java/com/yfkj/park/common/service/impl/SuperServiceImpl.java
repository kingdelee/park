package com.yfkj.park.common.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yfkj.park.common.service.SuperService;

import java.util.List;
import java.util.function.Function;

/**
 * @Title: SuperServiceImpl
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-10 14:59
 * @Modified By: Who(When)
 * @Version v1.0
 **/
public class SuperServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements SuperService<T> {

    @Override
    public List<T> retList(Function<T, Object> f) {
        return (List<T>) f.apply((T) this);

    }

}

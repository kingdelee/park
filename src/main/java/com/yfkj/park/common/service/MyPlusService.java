package com.yfkj.park.common.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * @Description: 自定义常用的，便捷的DAO接口，解决现在DAO没有对map等进行封装的问题
 * @Author: Jiandong.Li
 * @Date: 2019-05-08 14:56
 * @throws:
 */
public interface MyPlusService<T> {

    <F> Map<F, T> selectListRetMap(Wrapper<T> queryWrapper, Function<T, F> f);

    <F> Map<F, T> selectBatchIdsRetMap(Collection<? extends Serializable> idList, Function<T, F> f);
}

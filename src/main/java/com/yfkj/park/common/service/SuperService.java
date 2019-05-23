package com.yfkj.park.common.service;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.function.Function;

public interface SuperService<T> extends IService<T> {

    List<T> retList(Function<T, Object> f);

}

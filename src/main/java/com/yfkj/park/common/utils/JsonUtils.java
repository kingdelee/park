package com.yfkj.park.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Title: JsonUtils
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-23 17:47
 * @Modified By: Who(When)
 * @Version v1.0
 **/
public class JsonUtils {

    public static String parseToJson(Object t) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(t);
    }

}

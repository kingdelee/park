package com.yfkj.park.domain.entity;

/**
 * @Title: User
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-23 15:45
 * @Modified By: Who(When)
 * @Version v1.0
 **/
public class User {

    private String id;

    private String name;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

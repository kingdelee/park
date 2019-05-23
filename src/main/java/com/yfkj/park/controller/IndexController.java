package com.yfkj.park.controller;

import com.yfkj.park.common.utils.RestResponse;
import com.yfkj.park.domain.entity.User;
import com.yfkj.park.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/bbb")
    public RestResponse bbb(){
        return RestResponse.success("bbb");
    }

    @GetMapping("/aaa")
    public RestResponse aaa(){
        return RestResponse.success("aaa");
    }

    @GetMapping("/aaa")
    public RestResponse userList(){

        List<User> userList = userService.getUserList();

        return RestResponse.success(userList);
    }

}

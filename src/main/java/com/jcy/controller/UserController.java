package com.jcy.controller;

import com.guanweiming.common.ServerResponse;
import com.jcy.domain.User;
import com.jcy.service.UserService;
import com.jcy.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by JCY on 2018/5/6.
 */
@Slf4j
@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("login")
    public ServerResponse<UserVo> login(String username, String password) {
        log.info("username:{},password:{}",username,password);
        return userService.login(username,password);
    }
    @PostMapping("register")
    public ServerResponse<User>  register(String username, String password){
        return userService.register(username,password);
    }

}

package com.jcy.service;

import com.guanweiming.common.ServerResponse;
import com.jcy.domain.User;
import com.jcy.mapper.UserMapper;
import com.jcy.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.Objects;

/**
 * Created by JCY on 2018/5/6.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public ServerResponse<UserVo>  login(String username, String password) {
        /**
         * 1.查询对象 user
         * 2.比较用户密码是否一致
         * 3.一致成功 不一致失败
         */
        User user = userMapper.selectByUsername(username);
        if (user == null) {
            return ServerResponse.createByErrorMessage("用户不存在！");
        }

        if (!Objects.equals(password, user.getPassword())){
            return ServerResponse.createByErrorMessage("密码错误！");
        }
        UserVo vo = new UserVo();
        vo.setUsername(user.getUsername());

        return ServerResponse.createBySuccess(vo) ;
    }

    public ServerResponse<User> register(String username, String password) {
        User user = userMapper.selectByUsername(username);
        if (user!=null){
            return ServerResponse.createByErrorMessage("用户名已存在");
        }
        user = new User();
        user.setUsername(username);
        user.setPassword(password);

        int resultCount = userMapper.insert(user);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("创建失败！");
        }

        return ServerResponse.createBySuccess(user);

    }
}

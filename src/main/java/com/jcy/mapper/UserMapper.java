package com.jcy.mapper;

import com.jcy.BaseMapper;
import com.jcy.domain.User;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Past;

/**
 * Created by JCY on 2018/5/6.
 */
@Component
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 返回用户对象
     */
    User selectByUsername(@Param("username") String username);
}

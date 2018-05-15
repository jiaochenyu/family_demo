package com.jcy.mapper;

import com.jcy.BaseMapper;
import com.jcy.domain.Category;
import com.jcy.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by JCY on 2018/5/7.
 */
@Component
public interface CategoryMapper extends BaseMapper<Category> {

    List<Category> selectList();
}

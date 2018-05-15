package com.jcy.service;

import com.guanweiming.common.ServerResponse;
import com.jcy.domain.Category;
import com.jcy.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JCY on 2018/5/7.
 */
@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;


    public ServerResponse<List<Category>> categoryList() {
        List<Category> list = categoryMapper.selectList();
        return ServerResponse.createBySuccess(list);
    }

    public ServerResponse<Category> add(String name, int userid) {
        Category category = new Category();
        category.setCategoryName(name);
        category.setUserId(userid);
        if (categoryMapper.insert(category) == 0) {
            return ServerResponse.createByErrorMessage("创建失败");
        }
        return ServerResponse.createBySuccess(category);
    }
}

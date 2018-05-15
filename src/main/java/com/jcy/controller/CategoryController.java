package com.jcy.controller;

import com.guanweiming.common.ServerResponse;
import com.jcy.domain.Category;
import com.jcy.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by JCY on 2018/5/7.
 */
@Slf4j
@RequestMapping("category")
@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    @GetMapping("list")
    public ServerResponse<List<Category>> categoryList() {
        return categoryService.categoryList();
    }

    @PostMapping("add")
    public ServerResponse<Category> add(String name, int userid) {
        return categoryService.add(name, userid);
    }


}

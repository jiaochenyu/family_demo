package com.jcy.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by JCY on 2018/5/7.
 */
@Data
@Table(name = "tab_category")
public class Category {
    @Id
    @GeneratedValue(generator = "JDBC")
    private int id;
    private String categoryName;
    private int userId;
    
}

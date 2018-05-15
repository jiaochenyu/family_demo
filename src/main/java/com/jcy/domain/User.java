package com.jcy.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by JCY on 2018/5/6.
 */
@Data
@Table(name = "tab_user")
public class User {
    @Id
    @GeneratedValue(generator = "JDBC")
    private int id;
    private String username;
    private String password;
    private String name;
    private int manager;
    private int picId;

}

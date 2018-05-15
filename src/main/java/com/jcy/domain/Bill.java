package com.jcy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by JCY on 2018/5/9.
 */
@Data
public class Bill {
    @Id
    @GeneratedValue(generator = "JDBC")
    private  int id;
    private int userId;
    private String remark;
    private float price;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date time;
}

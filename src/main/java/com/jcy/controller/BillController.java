package com.jcy.controller;

import com.guanweiming.common.ServerResponse;
import com.jcy.service.BillService;
import com.jcy.vo.BillVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JCY on 2018/5/9.
 */
@RequestMapping("bill")
@RestController
public class BillController {
    @Autowired
    BillService billService;


    @GetMapping("detail")
    public ServerResponse<BillVo> detail(int id) {
        return billService.getDetail(id);
    }
}

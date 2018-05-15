package com.jcy.service;

import com.guanweiming.common.ServerResponse;
import com.jcy.domain.Bill;
import com.jcy.domain.Category;
import com.jcy.mapper.BillMapper;
import com.jcy.vo.BillVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JCY on 2018/5/9.
 */
@Service
public class BillService {
    @Autowired
    BillMapper billMapper;


    public ServerResponse<BillVo> getDetail(int id) {
        BillVo billVo = new BillVo();
        List<String> picList = billMapper.selectPics(id);
        billVo.setPictures(picList);
        List<Category> categoryList = billMapper.selectCategorys(id);
        Bill bill = billMapper.selectBill(id);
        if (bill == null){
            return ServerResponse.createByErrorMessage("没有该数据");
        }
        billVo.setBill(bill);
        billVo.setPictures(picList);
        billVo.setCategories(categoryList);
        return ServerResponse.createBySuccess(billVo);
    }

}

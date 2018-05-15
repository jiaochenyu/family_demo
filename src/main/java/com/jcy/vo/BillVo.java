package com.jcy.vo;

import com.jcy.domain.Bill;
import com.jcy.domain.Category;
import lombok.Data;

import java.util.List;

/**
 * Created by JCY on 2018/5/9.
 */
@Data
public class BillVo {
    private Bill bill;
    private List<String> pictures;
    private List<Category> categories;


}

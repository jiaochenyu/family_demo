package com.jcy.mapper;

import com.jcy.BaseMapper;
import com.jcy.domain.Bill;
import com.jcy.domain.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by JCY on 2018/5/9.
 */
@Component
public interface BillMapper  extends BaseMapper<Bill>{

    List<String> selectPics(@Param("id") int id);

    Bill selectBill(@Param("id") int id);

    List<Category> selectCategorys(@Param("id") int id);
}

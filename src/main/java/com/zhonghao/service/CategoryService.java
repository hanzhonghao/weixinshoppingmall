package com.zhonghao.service;

import com.zhonghao.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by zhonghao.han on 4/10/2018.
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}

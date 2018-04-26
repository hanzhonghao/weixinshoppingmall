package com.zhonghao.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品包含类目
 * Created by zhonghao.han on 4/10/2018.
 */
@Data
public class ProductVO {

    //此注解的作用就是返回给前端的时候返回的是name字段
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}

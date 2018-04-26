package com.zhonghao.controller;

import com.zhonghao.VO.ProductInfoVO;
import com.zhonghao.VO.ProductVO;
import com.zhonghao.VO.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by zhonghao.han on 4/10/2018.
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @GetMapping("/list")
    public ResultVo list() {
        ResultVo resultVo = new ResultVo();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVo.setData(Arrays.asList(productVO));

        resultVo.setCode(0);
        resultVo.setMsg("成功");

        return resultVo;
    }
}

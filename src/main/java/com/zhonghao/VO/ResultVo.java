package com.zhonghao.VO;

import lombok.Data;

/**
 * Created by zhonghao.han on 4/10/2018.
 * http请求返回的最外层对象
 */
@Data
public class ResultVo<T> {
    private Integer code;//错误码

    private String msg;//提示信息

    private T data;//具体内容
}

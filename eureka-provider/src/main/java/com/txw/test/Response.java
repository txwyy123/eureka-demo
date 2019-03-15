package com.txw.test;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by txwyy123 on 18/3/20.
 */
public class Response {

    @JSONField(name = "id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

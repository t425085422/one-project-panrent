package com.taotao.life.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RequestMapping(value = "/hello", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
public class UserController {


    @GetMapping
    public String hello() {
        // 直接将json信息打印出来
        System.out.println("转发成功");

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", "转发成功");

        return result.toJSONString();
    }
}

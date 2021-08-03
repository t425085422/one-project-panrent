package com.taotao.life.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @ResponseBody
    @RequestMapping(value = { "/hello" })
    public String insertArea(){
        return "hello";
    }
}

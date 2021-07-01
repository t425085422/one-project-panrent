package com.taotao.life.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CommonApplication {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

}

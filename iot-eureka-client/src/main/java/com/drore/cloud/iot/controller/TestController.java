package com.drore.cloud.iot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc: <br/>
 * @ProjectName: iot-server-cloud <br/>
 * @Date: 2018/6/12 11:21 <br/>
 * @Author: zhangz
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String hello(){
        return "您好！";
    }
}

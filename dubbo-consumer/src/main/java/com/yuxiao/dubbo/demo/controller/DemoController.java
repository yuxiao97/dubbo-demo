package com.yuxiao.dubbo.demo.controller;


import com.yuxiao.dubbo.demo.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference(protocol = "dubbo", check = false, version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/say")
    public String say(String name){
        return demoService.say(name);
    }

}

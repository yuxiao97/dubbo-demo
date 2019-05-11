package com.yuxiao.dubbo.demo.service.impl;

import com.yuxiao.dubbo.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Slf4j
@Service(value = "demoService")
@org.apache.dubbo.config.annotation.Service(interfaceName = "demoService",version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String say(String name) {
        log.info("name:{}", name);
        return "你说："+name;
    }
}

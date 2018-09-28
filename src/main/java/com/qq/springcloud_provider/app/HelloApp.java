package com.qq.springcloud_provider.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp {
    @GetMapping("/hello.do")
    public String hello(){
        System.out.println("服务提供者，接受消息"+System.currentTimeMillis()/1000);
        return "Hello要下课了吗,这里是服务提供者";
    }
}

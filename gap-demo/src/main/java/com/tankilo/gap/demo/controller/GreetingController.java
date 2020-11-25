package com.tankilo.gap.demo.controller;

import com.tankilo.gap.demo.service.GreetingService1;
import com.tankilo.gap.demo.service.GreetingService2;
import com.tankilo.gap.demo.service.NotTracedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService1 greetingService1;

    @Autowired
    private GreetingService2 greetingService2;

    @Autowired
    private NotTracedService notTracedService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        // 下面的方法睡眠40ms, 模拟未被跟踪方法的耗时
        notTracedService.makeGap1();
        greetingService1.insertGreetingHistory1(name);
        // 下面的方法睡眠80ms, 模拟未被跟踪方法的耗时
        notTracedService.makeGap3();
        greetingService2.insertGreetingHistory2(name);
        return "greeting,name=" + name;
    }

}
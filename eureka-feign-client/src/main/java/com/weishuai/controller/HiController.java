package com.weishuai.controller;

import com.weishuai.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WS on 2018/10/6.
 */
@RestController
public class HiController {
    @Autowired
    private HiService hiService;
    @GetMapping("/hi")
    public String sayHi(@RequestParam(required = false, defaultValue = "weishuai") String name){
        return hiService.sayHi(name);
    }
}

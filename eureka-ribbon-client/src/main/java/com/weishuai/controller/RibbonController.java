package com.weishuai.controller;

import com.weishuai.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WS on 2018/10/6.
 */
@RestController
public class RibbonController {

    @Autowired
    private  RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "weishuai") String name){
        return ribbonService.hi(name);
    }
}

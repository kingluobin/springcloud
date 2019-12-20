package com.jiaxing.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2017-12-10 20:37
 */
@RestController
@RefreshScope
public class ServerController {

    @Value("${girl}")
    private String girl;

    @GetMapping("/msg")
    public String msg() {
        return "this is product' msg :"+girl;
    }
}

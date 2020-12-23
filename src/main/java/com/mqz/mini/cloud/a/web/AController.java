package com.mqz.mini.cloud.a.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2020/12/23
 */
@RestController
@RequestMapping(value = "/a")
public class AController {

    @GetMapping("/1")
    public String get(){
        return "aaaaaaaaaaa:ok";
    }

}

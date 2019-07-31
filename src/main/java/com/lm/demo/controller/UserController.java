package com.lm.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lm
 * @since 2019-07-31 16:02
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("get")
    public String select (@RequestParam(name = "id") Integer id) {
        return "userId is " + id;
    }

    @GetMapping("t")
    public <T> void testParam (@RequestParam(name = "id") T param) {
        System.out.println(param);
    }



}

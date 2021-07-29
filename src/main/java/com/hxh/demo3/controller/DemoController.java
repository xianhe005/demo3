package com.hxh.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("demo")
    public String demo() {
        System.out.println("domo ok");
        System.out.println("domo hello");
        return "demo ok";
    }

    @RequestMapping("demo1")
    public String demo1() {
        System.out.println("domo1 ok");
        System.out.println("domo1 hello");
        return "demo1 ok";
    }
}

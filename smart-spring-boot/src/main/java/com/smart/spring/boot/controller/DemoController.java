package com.smart.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liujunhua
 * @description: DemoController
 * @date 2020/12/2516:13
 */
@Controller
public class DemoController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello,World!";
    }
}

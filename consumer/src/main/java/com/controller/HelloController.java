package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Kris
 * @Date: 2019-08-14  16:08
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")

    public String local() {
        return "from consumer";

    }
}

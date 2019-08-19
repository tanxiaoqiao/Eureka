package com.controller;

import com.response.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Kris
 * @Date: 2019-08-14  16:08
 */
@RestController
public class HelloController {

    @GetMapping (value = "/hello")

    public String local() {

        return "from provider";

    }

    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "/consumer/hello")

    public String fromConumer() {

        return consumerService.consumer();

    }
}

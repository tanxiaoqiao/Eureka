package com.response;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Kris
 * @Date: 2019-08-19  09:45
 */
@FeignClient(value = "consumer")
public interface ConsumerService {

    @GetMapping(path = "/hello")
    String consumer();
}

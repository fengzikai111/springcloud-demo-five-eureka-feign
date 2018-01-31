package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zwl on 2018/1/31.
 */
@FeignClient("eureka-client")
public interface HelloWordClient {
    @RequestMapping("/hi")
    public String home() ;
}

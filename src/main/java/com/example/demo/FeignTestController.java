package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zwl on 2018/1/31.
 */
@RestController
public class FeignTestController {
    @Autowired
    HelloWordClient helloWordClient;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public void hello() {
          helloWordClient.home();
    }

}

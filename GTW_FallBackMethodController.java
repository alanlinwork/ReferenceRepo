package com.mytest.cloud.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @RequestMapping"/userServiceFallBack"
    public String userServiceFallBack() {
        return "userService is taking longer time to respond";
    }

    @RequestMapping("/departmentServiceFallBack")
    public String departmentServiceCallBackMethod() {
        return "Department Service is taking longer time to respond";
    }
}

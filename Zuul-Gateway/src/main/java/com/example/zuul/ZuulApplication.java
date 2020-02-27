package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关入口
 * @author shaowen
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
@RestController
public class ZuulApplication {
    @GetMapping("/zuul/hello")
    public String hello() {
        return "hello zuul";
    }
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

}

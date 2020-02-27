package com.example.consumer.service;

import com.example.consumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shaowen
 */
@FeignClient(value = "Server-Provider", fallback = UserServiceFallback.class)
public interface UserService {

    @GetMapping("user/{id}")
    User get(@PathVariable("id") Long id);

    @GetMapping("user")
    List<User> get();

    @PostMapping("user")
    void add(@RequestBody User user);

    @PutMapping("user")
    void update(@RequestBody User user);

    @DeleteMapping("user/{id}")
    void delete(@PathVariable("id") Long id);
}

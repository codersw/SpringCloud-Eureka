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
    public User get(@PathVariable("id") Long id);

    @GetMapping("user")
    public List<User> get();

    @PostMapping("user")
    public void add(@RequestBody User user);

    @PutMapping("user")
    public void update(@RequestBody User user);

    @DeleteMapping("user/{id}")
    public void delete(@PathVariable("id") Long id);
}

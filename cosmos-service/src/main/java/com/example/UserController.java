package com.example;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> get() {
        return Lists.newArrayList(userRepository.findAll());
    }

    @PostMapping("/{name}/")
    public User create(@PathVariable String name){
        return userRepository.save(new User(name));
    }
}


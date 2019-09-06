package com.JpaAuditExample.DataJpaAdutitDemo.controller;

import com.JpaAuditExample.DataJpaAdutitDemo.domain.Movie;
import com.JpaAuditExample.DataJpaAdutitDemo.domain.User;
import com.JpaAuditExample.DataJpaAdutitDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void saveMovie(@ModelAttribute("user") User user){
        System.out.println(user.getName() + " "+
                                   user.toString());
        userRepository.save(user);
    }

    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }
}

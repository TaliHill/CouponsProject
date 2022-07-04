package com.tali.couponManagerPhaseTwo.controllers;

import com.tali.couponManagerPhaseTwo.dtos.User;
import com.tali.couponManagerPhaseTwo.logic.UsersLogic;
import org.hibernate.loader.entity.CascadeEntityJoinWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersLogic usersLogic;

    @PostMapping
    public long createUser(@RequestBody User user) {
        long userId = usersLogic.createUser(user);
        return userId;
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        usersLogic.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") long userId) {
        usersLogic.deleteUser(userId);
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") long userId) {
        return usersLogic.getUserById(userId);
    }

     @GetMapping
    public List<User> getAllUsers() {
        return usersLogic.getAllUsers();
     }

     @GetMapping("/byName")
    public User getUserByUsername(@RequestParam("username") String username) {
        return usersLogic.getUserByUsername(username);
     }
}

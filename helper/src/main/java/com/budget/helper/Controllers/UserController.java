package com.budget.helper.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.budget.helper.Entities.User;
import com.budget.helper.Repositiories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
  
  @Autowired
  private UserRepository userRepository;

  @GetMapping
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @GetMapping("/{id}")
  public User get(@PathVariable("id") long id){
    return userRepository.getReferenceById(id);
  }

  @PostMapping
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }
}

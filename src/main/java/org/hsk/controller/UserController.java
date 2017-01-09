package org.hsk.controller;

import org.hsk.model.mongo.User;
import org.hsk.repository.mongo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cartman on 11.12.16.
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/get/{id}")
  public User getUser(@PathVariable String id) {
    return userRepository.findOne(id);
  }

  @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  public String addUser(@RequestBody User user) {
    userRepository.save(user);
    return "success";
  }
}

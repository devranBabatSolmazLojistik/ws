package com.example.ws.controller;

import com.example.ws.entity.userEntity;
import com.example.ws.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {

      @Autowired
      UserService userService;

      @PostMapping("/api/1.0/userscreate")
      /*@ResponseStatus(HttpStatus.CREATED)*/
      public GenericResponse createUser(@RequestBody userEntity user){
        userService.save(user);
        return new GenericResponse("user oluşturuldu");

      }@PostMapping("/api/1.0/usersremove")
      public GenericResponse removeUser(@RequestBody userEntity user){
          userService.remove(user);
          return new GenericResponse("user silindi");
      }
}

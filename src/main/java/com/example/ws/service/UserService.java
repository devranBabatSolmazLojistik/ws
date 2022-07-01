package com.example.ws.service;

import com.example.ws.entity.userEntity;
import com.example.ws.repository.UserRepository;
import com.example.ws.entity.userEntity;
/*import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;
  /*  PasswordEncoder passwordEncoder;*/


    public UserService(UserRepository userRepository){
        super();
        this.userRepository= userRepository;
    }
    public void save(userEntity user){

        /*user.setPassword(this.passwordEncoder.encode(user.getPassword()));*/ // password veritabanında şifreleniyor
        userRepository.save(user);

    }
    public void remove(userEntity user){

        userRepository.delete(user);
    }

}

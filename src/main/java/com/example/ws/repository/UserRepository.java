package com.example.ws.repository;

import com.example.ws.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <userEntity, Long>{

}

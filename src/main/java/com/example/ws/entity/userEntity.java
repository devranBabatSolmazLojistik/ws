package com.example.ws.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class userEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // araştır
    private Long id;
    private String username;
    private String displayName;
    private String password;


}

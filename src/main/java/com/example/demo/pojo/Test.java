package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_user")
public class Test {
    @Id
    private String id;
    private String username;
    private String password;


}

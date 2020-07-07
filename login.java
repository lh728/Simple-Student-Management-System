package com.example.entity;



import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Table;

//配置实体类login class的getter setter方法
@Entity
@Table(name="login")
public class login {

    @Id
    private int id;
    private String name;
    private int password;
    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPassword() {

        return password;
    }

    public void setPassword(int password) {

        this.password = password;
    }
}

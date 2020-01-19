package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="姓名不能为空")
    private String name;

    @NotEmpty(message="邮箱不能为空")
    @Email(message="邮箱格式不对")
    private String email;

    @NotEmpty(message="密码不能为空")
    private String password;

    @NotEmpty(message="账号不能为空")
    private String account;

    public User(){
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account){
        this.account = account;
    }
    public User(String name,String email,String password,String account){
        this.name=name;
        this.email=email;
        this.password=password;
        this.account=account;
    }
    @Override
    public String toString(){
        return String.format("User[id=%d,name='%s',email='%s',account='%s']",id,name,email,account);
    }
}


package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.vo.Response;
import com.sun.deploy.security.CertStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 删除用户
     * @param id
     * @param model
     * @return
     */
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Response> delete(@PathVariable("id") Long id,Model model){
        userService.removeUser(id);
        return ResponseEntity.ok().body(new Response(true,"处理成功"));
    }
}

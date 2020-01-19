package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.Optional;

public interface UserService {
    /**
     * 新增、编辑、保存用户
     * @param user
     * @return
     */
    User saveOrUpdate(User user);
    /**
     * 注册用户
     * @param user
     * @return
     */
    User registerUser(User user);
    /**
     * 删除用户
     * @param id
     * @return
     */
    void removeUser(Long id);
    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    Optional<User> getUserById(Long id);
}

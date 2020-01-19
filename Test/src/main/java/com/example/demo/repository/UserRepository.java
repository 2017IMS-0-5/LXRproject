package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    /**
     * 根据用户帐号查询用户
     * @param account
     * @return
     */
    User findByAccount(String account);
}

package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User saveOrUpdate                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            (User user){
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public User registerUser(User user){
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public void removeUser(Long id){
        userRepository.deleteById(id);
    }

    @Transactional
    @Override
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
}

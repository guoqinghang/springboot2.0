package com.guo.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void addUser(String name, Integer age);

    void deleteByName(String name);

    Integer getAllUsers();

    void deleteAllUsers();

}

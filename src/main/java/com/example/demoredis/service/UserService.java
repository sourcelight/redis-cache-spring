package com.example.demoredis.service;

import com.example.demoredis.domain.User;

import java.util.List;

public interface UserService {
    User getUser(long id);
    List<User> getAll();
    void delete(long id);
    User update(User user);
    User create(User user);
}

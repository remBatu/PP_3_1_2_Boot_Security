package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;


public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    void delete( int id);
}

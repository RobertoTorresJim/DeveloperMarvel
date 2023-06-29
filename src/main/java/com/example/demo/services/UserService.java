package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.models.UserVO;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    UserVO findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
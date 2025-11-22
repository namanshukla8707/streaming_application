package com.code.free.services.AdminService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.code.free.entities.UserEntity;
import com.code.free.repositories.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final UserRepo userRepo;

    public List<UserEntity> getUsers() {
        List<UserEntity> users = userRepo.findAll();
        return users;
    }
}

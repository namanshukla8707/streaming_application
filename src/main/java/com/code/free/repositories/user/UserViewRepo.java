package com.code.free.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.free.entities.user.UserView;

public interface UserViewRepo extends JpaRepository<UserView, Long> {

    
} 
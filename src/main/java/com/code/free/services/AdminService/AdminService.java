package com.code.free.services.AdminService;

import java.util.List;
import org.springframework.stereotype.Service;
import com.code.free.entities.user.UserView;
import com.code.free.repositories.user.UserViewRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final UserViewRepo userViewRepo;

    public List<UserView> getUsers() {
        List<UserView> users = userViewRepo.findAll();
        return users;
    }
}

package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.repositories.UserRepositoriy;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepositoriy userRepositoriy;

    public UserService(UserRepositoriy userRepositoriy) {
        this.userRepositoriy = userRepositoriy;
    }

    @Transactional
    public UserModel save(UserModel userModel){
        return userRepositoriy.save(userModel);
    }
}

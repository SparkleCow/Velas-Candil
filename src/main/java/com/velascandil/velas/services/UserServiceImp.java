package com.velascandil.velas.services;

import com.velascandil.velas.entities.User;
import com.velascandil.velas.models.UserRegisterDto;
import com.velascandil.velas.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    @Override
    public User create(UserRegisterDto userRegisterDto) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public Collection<User> findAll() {
        return List.of();
    }

    @Override
    public User updateById(Integer id, User user) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}

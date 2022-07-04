package com.tali.couponManagerPhaseTwo.logic;

import com.tali.couponManagerPhaseTwo.dtos.User;
import com.tali.couponManagerPhaseTwo.entites.UserEntity;
import com.tali.couponManagerPhaseTwo.repositories.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersLogic {

    @Autowired
    private IUsersRepository usersRepository;

    public long createUser(User user) {
        UserEntity userEntity = new UserEntity(user);
        usersRepository.save(userEntity);
        return userEntity.getUserId();
    }

    public void updateUser(User user) {
        UserEntity userEntity = new UserEntity(user);
        usersRepository.save(userEntity);
    }

    public void deleteUser(long userId) {
        usersRepository.deleteById(userId);
    }

    public User getUserById(long userId) {
        UserEntity userEntity = usersRepository.findById(userId).get();
        User user = new User(userEntity);
        return user;
    }

    public List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>();
        Iterable<UserEntity> usersIterable = usersRepository.findAll();
        for (UserEntity userEntity : usersIterable) {
            User user = new User(userEntity);
           usersList.add(user);
        }
        return usersList;
    }

    public User getUserByUsername(String username) {
        UserEntity userEntity = usersRepository.findByUsername(username);
        User user = new User(userEntity);
        return user;
    }
}

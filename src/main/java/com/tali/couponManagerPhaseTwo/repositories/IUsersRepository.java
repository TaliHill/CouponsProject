package com.tali.couponManagerPhaseTwo.repositories;

import com.tali.couponManagerPhaseTwo.entites.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUsersRepository extends CrudRepository<UserEntity, Long> {
    public UserEntity findByUsername (String username);
}

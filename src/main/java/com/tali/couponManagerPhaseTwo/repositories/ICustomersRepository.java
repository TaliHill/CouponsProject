package com.tali.couponManagerPhaseTwo.repositories;

import com.tali.couponManagerPhaseTwo.entites.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICustomersRepository extends CrudRepository<CustomerEntity, Long> {
}

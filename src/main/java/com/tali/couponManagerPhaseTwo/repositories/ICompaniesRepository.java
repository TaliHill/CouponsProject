package com.tali.couponManagerPhaseTwo.repositories;

import com.tali.couponManagerPhaseTwo.entites.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICompaniesRepository extends CrudRepository<CompanyEntity, Long> {
    public CompanyEntity findByName (String name);
}


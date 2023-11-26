package com.sfm2023.BikeRevolution.Repositories;

import com.sfm2023.BikeRevolution.Entities.LoginData;
import com.sfm2023.BikeRevolution.Entities.WebCustomers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDataRepository extends JpaRepository<LoginData,Long> {
    WebCustomers findOneById(Long id);
}

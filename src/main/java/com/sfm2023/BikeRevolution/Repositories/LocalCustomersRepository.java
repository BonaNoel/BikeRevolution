package com.sfm2023.BikeRevolution.Repositories;

import com.sfm2023.BikeRevolution.Entities.LocalCustomers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalCustomersRepository extends JpaRepository<LocalCustomers,Long> {
}

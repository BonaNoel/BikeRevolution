package com.sfm2023.BikeRevolution.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers,Long> {
    Customers findOneById(Long id);
}

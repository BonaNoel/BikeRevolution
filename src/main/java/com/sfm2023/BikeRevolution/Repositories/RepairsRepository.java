package com.sfm2023.BikeRevolution.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairsRepository extends JpaRepository<Repairs, Long> {
    Repairs findOneById(Long id);
}

package com.sfm2023.BikeRevolution.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairsRepository extends JpaRepository<Repairs, Long> {
    Repairs findOneById(Long id);
}

package com.sfm2023.BikeRevolution.Repositories;

import com.sfm2023.BikeRevolution.Entities.ResourceCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ResourceCostRepository extends JpaRepository<ResourceCost,Long> {
    ResourceCost findOneById(Long id);
}

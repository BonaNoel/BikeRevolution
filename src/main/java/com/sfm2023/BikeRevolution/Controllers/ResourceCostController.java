package com.sfm2023.BikeRevolution.Controllers;

import com.sfm2023.BikeRevolution.Repositories.ResourceCostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceCostController {
    @Autowired
    ResourceCostRepository resourceCostRepository;

}

package com.sfm2023.BikeRevolution.Controllers;

import com.sfm2023.BikeRevolution.Entities.LocalCustomers;
import com.sfm2023.BikeRevolution.Repositories.LocalCustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocalCustomersController {
    @Autowired
    LocalCustomersRepository localCustomersRepository;

    public void saveLocalCustomer(String name, String phoneNumber, Long serviceId){
        localCustomersRepository.save(LocalCustomers.builder()
                .name(name)
                .phone(phoneNumber)
                .serviceTypeId(serviceId)
                .build());
    }
}

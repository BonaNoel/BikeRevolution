package com.sfm2023.BikeRevolution.Controllers;

import com.sfm2023.BikeRevolution.Entities.LocalCustomers;
import com.sfm2023.BikeRevolution.Repositories.LocalCustomersRepository;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocalCustomersController {

    @Autowired
    LocalCustomersRepository localCustomersRepository;


    public void saveLocalCustomer(String name, String phoneNumber, Long repairTypeId){
        localCustomersRepository.save(LocalCustomers.builder()
                .name(name)
                .phone(phoneNumber)
                .repairTypeId(repairTypeId)
                .build());
    }

    public Long getLastRepairTypeId() {
        return localCustomersRepository.findAll().get(localCustomersRepository.findAll().size() - 1).getRepairTypeId();
    }
}

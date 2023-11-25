package com.sfm2023.BikeRevolution.Controllers;


import com.sfm2023.BikeRevolution.Entities.LocalCustomers;
import com.sfm2023.BikeRevolution.Entities.Parts;
import com.sfm2023.BikeRevolution.Entities.Repairs;
import com.sfm2023.BikeRevolution.Repositories.LocalCustomersRepository;
import com.sfm2023.BikeRevolution.Repositories.PartsRepository;
import com.sfm2023.BikeRevolution.Repositories.RepairsRepository;
import jakarta.annotation.PostConstruct;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RepairsController {

    @Autowired
    RepairsRepository repairsRepository;

    @Autowired
    LocalCustomersController localCustomersController;

    public ObservableList<String> getRepairsName(){
        List<String> repairsName = new ArrayList<>();
        repairsRepository.findAll().forEach(repairs -> repairsName.add(repairs.getName()));
        return FXCollections.observableList(repairsName);
    }

    // write a method which gets a name and a phonbe number and servicename and converts the servicename to the service id and saves it to the database
    public void saveLocalCustomerRepairRequest(String name, String phoneNumber, String serviceName){
        repairsRepository.findAll().forEach(repairs -> {
            if (repairs.getName().equals(serviceName)){
                Long serviceId = Long.parseLong(repairs.getId().toString());
                localCustomersController.saveLocalCustomer(name, phoneNumber, serviceId);
                return;
            }
        });
    }
}

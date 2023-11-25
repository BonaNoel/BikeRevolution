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


    public ObservableList<String> getRepairsName(){
        List<String> repairsName = new ArrayList<>();
        repairsRepository.findAll().forEach(repairs -> repairsName.add(repairs.getName()));
        return FXCollections.observableList(repairsName);
    }

    public Long convertRepairNameToRepairId(String repairName){
        Long repairId = null;
        for (Repairs repairs : repairsRepository.findAll()){
            if (repairs.getName().equals(repairName)){
                repairId = repairs.getId();
            }
        }
        return repairId;
    }

    public String convertRepairIdToRepairName(Long repairId){
        String repairName = null;
        for (Repairs repairs : repairsRepository.findAll()){
            if (repairs.getId().equals(repairId)){
                repairName = repairs.getName();
            }
        }
        return repairName;
    }


    public String getRepairNameById(Long id){
        return repairsRepository.findById(id).get().getName();
    }

    public String getRepairDescriptionById(Long repairTypeId) {
        return repairsRepository.findById(repairTypeId).get().getDescription();
    }
}

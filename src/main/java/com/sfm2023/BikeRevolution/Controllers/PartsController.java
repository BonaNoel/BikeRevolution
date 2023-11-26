package com.sfm2023.BikeRevolution.Controllers;


import com.sfm2023.BikeRevolution.Entities.Parts;
import com.sfm2023.BikeRevolution.Repositories.PartsRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PartsController {

    @Autowired
    PartsRepository partsRepository;


    public ObservableList<String> getPartNameAndQuantity() {
        List<Parts> partsList = partsRepository.findAll();
        List<String> formattedPartStrings = new ArrayList<>();

        for (Parts parts : partsList) {
            String sb = parts.getName() +
                    " " +
                    parts.getQuantity() +
                    " db";

            formattedPartStrings.add(sb);
        }
        return FXCollections.observableList(formattedPartStrings);
    }

    public void increasePartQuantityByName(String partName) {
        Parts parts = partsRepository.findByName(partName);
        parts.setQuantity(parts.getQuantity() + 1);
        partsRepository.save(parts);
    }


    public void decreasePartQuantityById(Long partId, Long partQuantity) {
        Parts parts = partsRepository.findById(partId).get();
        parts.setQuantity((int) (parts.getQuantity() + partQuantity));
        partsRepository.save(parts);
    }
}

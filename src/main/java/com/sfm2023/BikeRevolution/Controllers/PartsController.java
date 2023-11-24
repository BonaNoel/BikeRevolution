package com.sfm2023.BikeRevolution.Controllers;


import com.sfm2023.BikeRevolution.Entities.Parts;
import com.sfm2023.BikeRevolution.Repositories.PartsRepository;
import jakarta.annotation.PostConstruct;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PartsController {

    @Autowired
    PartsRepository partsRepository;

    @PostConstruct
    public ObservableList<Parts> listViewWrite() {
        List<Parts> partsList = partsRepository.findAll();
        return FXCollections.observableList(partsList);
    }
}

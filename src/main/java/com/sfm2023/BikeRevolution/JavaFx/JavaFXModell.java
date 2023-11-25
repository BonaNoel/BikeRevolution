package com.sfm2023.BikeRevolution.JavaFx;

import com.sfm2023.BikeRevolution.Controllers.LocalCustomersController;
import com.sfm2023.BikeRevolution.Controllers.PartsController;
import com.sfm2023.BikeRevolution.Controllers.RepairsController;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaFXModell {

    @Autowired
    RepairsController repairsController;

    @Autowired
    PartsController partsController;

    @Autowired
    LocalCustomersController localCustomersController;

    public void saveLocalCustomerRepairRequest(String name, String phoneNumber, String serviceName){
        localCustomersController.saveLocalCustomer(name, phoneNumber, repairsController.convertRepairNameToRepairId(serviceName));
    }

    public void putLocalCustomerRequestInTitledPane(TitledPane titledPane){
        String repairName = "Szerviz típusa: " + repairsController.convertRepairIdToRepairName(localCustomersController.getLastRepairTypeId());
        TextField repairNameTextField = new TextField( repairName);

        String repairDescription = "Szerviz leírása: " + repairsController.getRepairDescriptionById(localCustomersController.getLastRepairTypeId());
        TextField repairDescriptionTextField = new TextField(repairDescription);

        Button doneButton = new Button("Kész");

        titledPane.setContent(repairNameTextField);
        titledPane.setContent(repairDescriptionTextField);
        titledPane.setContent(doneButton);
    }



}

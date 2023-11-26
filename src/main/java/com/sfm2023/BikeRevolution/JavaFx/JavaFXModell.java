package com.sfm2023.BikeRevolution.JavaFx;

import com.sfm2023.BikeRevolution.Controllers.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class JavaFXModell {

    @Autowired
    RepairsController repairsController;

    @Autowired
    PartsController partsController;

    @Autowired
    LocalCustomersController localCustomersController;

    @Autowired
    WebCustomerController webCustomersController;

    @Autowired
    ResourceCostController resourceCostController;

    public void saveLocalCustomerRepairRequest(String name, String phoneNumber, String serviceName){
        localCustomersController.saveLocalCustomer(name, phoneNumber, repairsController.convertRepairNameToRepairId(serviceName));
    }

    public void putLocalCustomerRequestInTitledPane(@NonNull TitledPane titledPane){
        String repairName = "Szerviz típusa: " + repairsController.convertRepairIdToRepairName(localCustomersController.getLastRepairTypeId());
        Label repairNameLabel = new Label( repairName);

        String repairDescription = "Szerviz leírása: " + repairsController.getRepairDescriptionById(localCustomersController.getLastRepairTypeId());
        Label repairDescriptionLabel = new Label(repairDescription);


        VBox contentContainer = new VBox(20);
        contentContainer.getChildren().addAll(repairNameLabel, repairDescriptionLabel);
        titledPane.setContent(contentContainer);
    }
    public void refreshRaktarListView(@NonNull ListView<String> raktarListVieW) {
        raktarListVieW.setItems(partsController.getPartNameAndQuantity());
    }

    public void refreshSzervizTipusChoiceBox(@NonNull ChoiceBox<String> szervizTipusChoiceBox) {
        szervizTipusChoiceBox.setItems(repairsController.getRepairsName());
    }

    public void putWebCustomerRequestInTitledPane(@NonNull TitledPane titledPane, String date) {

        String webCustomerPhoneNumber = "Telefonszám: " + webCustomersController.getWebCustomerPhoneByDate(date);
        Label webCustomerPhoneNumberLabel = new Label(webCustomerPhoneNumber);

        String webCustomerRepairDescription = "Leírása: " + webCustomersController.getWebCustomerDescriptionByDate(date);
        Label webCustomerRepairDescriptionLabel = new Label(webCustomerRepairDescription);


        VBox contentContainer = new VBox(20);
        contentContainer.getChildren().addAll(webCustomerPhoneNumberLabel, webCustomerRepairDescriptionLabel);
        titledPane.setContent(contentContainer);
    }

    public void makeChangesToPartQuantity(Long repairId) {

        ArrayList<String> resourcesList =  resourceCostController.getNeededPartsByRepairId(repairId);
        ArrayList<Long> partsIdList = resourceCostController.getPartId(resourcesList);
        ArrayList<Long> partQuantityList = resourceCostController.getPartQuantity(resourcesList);

        for (int i = 0; i < partsIdList.size(); i++) {
            partsController.decreasePartQuantityById(partsIdList.get(i), partQuantityList.get(i));
        }

    }


}

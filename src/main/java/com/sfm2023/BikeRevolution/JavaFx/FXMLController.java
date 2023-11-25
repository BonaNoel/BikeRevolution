package com.sfm2023.BikeRevolution.JavaFx;

import com.sfm2023.BikeRevolution.Controllers.LocalCustomersController;
import com.sfm2023.BikeRevolution.Controllers.PartsController;
import com.sfm2023.BikeRevolution.Controllers.RepairsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class FXMLController implements Initializable{

    @Autowired
    PartsController partsController;

    @Autowired
    RepairsController repairsController;


    @FXML
    private TreeView<?> foglalasokTreeView;

    @FXML
    private TextField nevTextField;

    @FXML
    private TextField telefonTextField;

    @FXML
    private ListView<String> raktarListVieW;


    @FXML
    private ChoiceBox<String> szervizTipusChoiceBox;




    @FXML
    private Button foglalasButton;

    @FXML
    void foglalasAction(ActionEvent event) {
        repairsController.saveLocalCustomerRepairRequest(nevTextField.getText(), telefonTextField.getText(), szervizTipusChoiceBox.getValue());
        nevTextField.clear();
        telefonTextField.clear();
        szervizTipusChoiceBox.setValue(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        szervizTipusChoiceBox.setItems(repairsController.getRepairsName());

        raktarListVieW.setItems(partsController.getPartNameAndQuantity());
    }

}




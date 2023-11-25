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
    JavaFXModell javaFXModell;

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
    private Accordion foglalasAccordion;


    @FXML
    private Button foglalasButton;

    @FXML
    private Tab foglalasTab;

    @FXML
    void foglalasAction(ActionEvent event) {
        javaFXModell.saveLocalCustomerRepairRequest(nevTextField.getText(), telefonTextField.getText(), szervizTipusChoiceBox.getValue());

        TitledPane titledPane = createTitledPane(nevTextField.getText() + " " + telefonTextField.getText());
        javaFXModell.putLocalCustomerRequestInTitledPane(titledPane);
        foglalasAccordion.getPanes().add(titledPane);

        nevTextField.clear();
        telefonTextField.clear();
        szervizTipusChoiceBox.setValue(null);

    }

    private TitledPane createTitledPane(String name){
        TitledPane titledPane = new TitledPane();
        titledPane.setText(name);
        return titledPane;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        szervizTipusChoiceBox.setItems(javaFXModell.repairsController.getRepairsName());

        raktarListVieW.setItems(javaFXModell.partsController.getPartNameAndQuantity());
    }



}




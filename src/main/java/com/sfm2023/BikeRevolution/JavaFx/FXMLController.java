package com.sfm2023.BikeRevolution.JavaFx;

import com.sfm2023.BikeRevolution.Repositories.CustomersRepository;
import com.sfm2023.BikeRevolution.Repositories.Parts;
import com.sfm2023.BikeRevolution.Repositories.PartsRepository;
import com.sfm2023.BikeRevolution.Repositories.RepairsRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;


public class FXMLController implements Initializable{

    @Autowired
    PartsRepository partsRepository;

    @Autowired
    RepairsRepository repairsRepository;

    @Autowired
    CustomersRepository customersRepository;

    @FXML
    private TextField arTextField;

    @FXML
    private Tab foglalasTab;

    @FXML
    private TreeView<?> foglalasokTreeView;

    @FXML
    private TextField nevTextField;

    @FXML
    private ListView<Parts> raktarListVieW;

    @FXML
    private Tab raktarTab;

    @FXML
    private Tab szervizFoglalasTab;

    @FXML
    private ChoiceBox<?> szervizTipusChoiceBox;

    @FXML
    private TabPane tabController;

    @FXML
    private TextField telefonTextField;

    @FXML
    private Tab webTab;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        System.out.println("Pisi");

//        raktarListVieW.getItems().setAll(FXCollections.observableList(partsRepository.findAll()));
//        Modell.listViewWrite();

    }
}




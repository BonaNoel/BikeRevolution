package com.sfm2023.BikeRevolution.JavaFx;

import com.sfm2023.BikeRevolution.Entities.Parts;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

//@Component
public class FXMLController implements Initializable{

//    @Autowired
//    PartsRepository partsRepository;
//
//    @Autowired
//    RepairsRepository repairsRepository;

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
//        PartsController partsController = new PartsController();
//
//        raktarListVieW.setItems(partsController.listViewWrite());
    }
}




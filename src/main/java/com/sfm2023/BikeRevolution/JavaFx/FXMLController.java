package com.sfm2023.BikeRevolution.JavaFx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {

    @FXML
    private TextField arTextField;

    @FXML
    private Tab foglalasTab;

    @FXML
    private TreeView<?> foglalasokTreeView;

    @FXML
    private TextField nevTextField;

    @FXML
    private ListView<?> raktarListVieW;

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
    public void initialize(URL url, ResourceBundle rb) {


    }
}




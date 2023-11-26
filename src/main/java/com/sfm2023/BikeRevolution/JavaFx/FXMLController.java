package com.sfm2023.BikeRevolution.JavaFx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static org.codehaus.plexus.util.StringUtils.trim;

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
    private Button frissitesButton;

    @FXML
    private Accordion webAccordion;

    @FXML
    void frissitesButtonAction(ActionEvent event) {
        webAccordion.getPanes().clear();

        List<String> titledPaneNames = javaFXModell.webCustomersController.getWebCustomerNameAndDate();

        for (String titledPaneName : titledPaneNames) {
            TitledPane titledPane = createTitledPane(titledPaneName);
            System.out.println(titledPaneName);
            String[] tmp = titledPaneName.replaceAll("[^0-9]", " ").trim().split(" ");
            String date = tmp[0] + "-" +  tmp[1]+ "-" + tmp[2] + "T" + tmp[3] + ":" + tmp[4];
            System.out.println(date);
            javaFXModell.putWebCustomerRequestInTitledPane(titledPane, date);
            webAccordion.getPanes().add(titledPane);
        }

    }

    @FXML
    void foglalasAction(ActionEvent event) {
//        Ide meg a save elott csekk hogy van e eleg alkatresz

        javaFXModell.saveLocalCustomerRepairRequest(nevTextField.getText(), telefonTextField.getText(), szervizTipusChoiceBox.getValue());

        TitledPane titledPane = createTitledPane(nevTextField.getText() + "    " + telefonTextField.getText());
        javaFXModell.putLocalCustomerRequestInTitledPane(titledPane);
        foglalasAccordion.getPanes().add(titledPane);

        nevTextField.clear();
        telefonTextField.clear();
        szervizTipusChoiceBox.setValue(null);

    }

    private @NonNull TitledPane createTitledPane(String name){
        TitledPane titledPane = new TitledPane();
        titledPane.setText(name);
        return titledPane;
    }

    @FXML
    void rendelesAction(ActionEvent event) {
        String partName = raktarListVieW.getSelectionModel().getSelectedItem().split("[0-9]")[0].trim();
        javaFXModell.partsController.increasePartQuantityByName(partName);
        javaFXModell.refreshRaktarListView(raktarListVieW);
        raktarListVieW.getSelectionModel().select(partName);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        javaFXModell.refreshSzervizTipusChoiceBox(szervizTipusChoiceBox);
        javaFXModell.refreshRaktarListView(raktarListVieW);
    }




}




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


@Component
public class FXMLController implements Initializable{

    @Autowired
    JavaFXModell javaFXModell;


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
    private Button keszButton;

    private TitledPane expandedPane;

    @FXML
    void keszButtonAction(ActionEvent event) {

        if (expandedPane != null) {

            Long CustomerId =Long.valueOf(expandedPane.getText().split("\\.")[0]);
            Long repairId = javaFXModell.localCustomersController.getRepairIdByCustomerId(CustomerId);

            javaFXModell.makeChangesToPartQuantity(repairId);

            javaFXModell.localCustomersController.markRepairAsDone(CustomerId);

            javaFXModell.refreshRaktarListView(raktarListVieW);


            foglalasAccordion.getPanes().remove(expandedPane);
        }
    }

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
            titledPane.setStyle("-fx-background-color: lightblue; -fx-text-fill: #333333; -fx-font-size: 14;");
            webAccordion.getPanes().add(titledPane);
        }

    }

    private Long customerID = 1L;
    @FXML
    void foglalasAction(ActionEvent event) {

        Boolean valid = javaFXModell.checkIfThereIsEnoughParts(szervizTipusChoiceBox.getValue());

        if (!valid){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText("Nincs elég alkatrész");
            alert.setContentText("Kérjük válasszon másik szerviztípust");
            alert.showAndWait();
            return;
        }

        javaFXModell.saveLocalCustomerRepairRequest(nevTextField.getText(), telefonTextField.getText(), szervizTipusChoiceBox.getValue());

        TitledPane titledPane = createTitledPane(customerID + ".  " + nevTextField.getText() + "    " + telefonTextField.getText());
        titledPane.setStyle("-fx-background-color: lightblue; -fx-text-fill: #333333; -fx-font-size: 14;");

        customerID++;
        javaFXModell.putLocalCustomerRequestInTitledPane(titledPane);
        foglalasAccordion.getPanes().add(titledPane);

        nevTextField.clear();
        telefonTextField.clear();
        szervizTipusChoiceBox.setValue(null);

    }

    private @NonNull TitledPane createTitledPane(String name){
        TitledPane titledPane = new TitledPane();
        titledPane.setText(name);
        titledPane.setStyle("-fx-background-color: lightblue; -fx-text-fill: #333333; -fx-font-size: 14;");
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

        foglalasAccordion.expandedPaneProperty().addListener((observable, oldValue, newValue) -> {
            expandedPane = newValue;
        });
    }




}




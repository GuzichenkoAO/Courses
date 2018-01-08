package com.guzichenko.program.controllers;

import com.guzichenko.program.model.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateClient {

    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField age;

    @FXML
    private Button cancelButton;

    public Client readData(ActionEvent actionEvent) {
        System.out.println(name.getText());
        System.out.println(surname.getText());
        System.out.println(age.getText());
        return new Client(1, "", "", 0);
    }

    public void back() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}

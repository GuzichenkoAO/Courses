package com.guzichenko.program.controllers;

import com.guzichenko.program.DAO.ClientDao;
import com.guzichenko.program.model.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateClient {

	private ClientDao clientDao;

	@FXML
	private TextField name;
	@FXML
	private TextField surname;
	@FXML
	private TextField age;

	@FXML
	private Button cancelButton;

	public CreateClient() {
		this.clientDao = new ClientDao();
	}

	public void readData(ActionEvent actionEvent) {
		clientDao.addClient(new Client(name.getText(), surname.getText(), Integer.valueOf(age.getText())));
	}

	public void back() {
		Stage stage = (Stage) cancelButton.getScene().getWindow();
		stage.close();
	}
}

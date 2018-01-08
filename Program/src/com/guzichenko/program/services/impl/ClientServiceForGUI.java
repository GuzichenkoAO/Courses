package com.guzichenko.program.services.impl;

import com.guzichenko.program.model.Client;
import com.guzichenko.program.services.ClientService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.List;

public class ClientServiceForGUI implements ClientService {

    private ObservableList<Client> clients = FXCollections.observableArrayList();

    @Override
    public void addClient() throws IOException {

    }

    @Override
    public void removeClient() throws IOException {

    }

    @Override
    public void editClient() throws IOException {

    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }
}

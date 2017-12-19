package com.guzichenko.courses.program.services;

import com.guzichenko.courses.program.model.Client;

import java.io.IOException;
import java.util.List;

public interface ClientService {

    void addClient() throws IOException;

    void removeClient() throws IOException;

    void editClient() throws IOException;

    List<Client> getAllClients();

    //modify, find etc....

}

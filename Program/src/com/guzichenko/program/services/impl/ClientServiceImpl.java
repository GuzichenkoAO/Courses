package com.guzichenko.program.services.impl;

import com.guzichenko.program.model.Client;
import com.guzichenko.program.services.ClientService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements ClientService {


    private BufferedReader reader;
    private List<Client> clients;

    public ClientServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.clients = new ArrayList<>();
    }

    @Override
    public void addClient() throws IOException {
        System.out.println("Введите ID:");
        int id = readNumber();
        System.out.println("Введите имя:");
        String name = reader.readLine();
        System.out.println("Введите фамилию:");
        String surname = reader.readLine();
        System.out.println("Введите возраст:");
        int age = readNumber();
        clients.add(new Client(id, name, surname, age));
    }

    @Override
    public void removeClient() throws IOException {
        System.out.println("Введите ID:");
        int id = readNumber();
        for (Client client : clients) {
            if (client.getId() == id) {
                clients.remove(client);
            }
        }
    }

    @Override
    public void editClient() {
        System.out.println("Edit client");

    }

    @Override
    public List<Client> getAllClients() {
        return clients;
    }


    private int readNumber() throws IOException {
        int id;
        while (true) {
            try {
                id = Integer.valueOf(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Не правильный ввод. Введите целое число");
            }
        }
        return id;
    }
}

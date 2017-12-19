package com.guzichenko.courses.program.services.impl;

import com.guzichenko.courses.program.DAO.ClientDao;
import com.guzichenko.courses.program.model.Client;
import com.guzichenko.courses.program.services.ClientService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ClientServiceDb implements ClientService {

    private ClientDao dao;
    private BufferedReader reader;

    public ClientServiceDb() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.dao = new ClientDao();
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
        dao.addClient(new Client(id, name, surname, age));
    }

    @Override
    public void removeClient() throws IOException {
        System.out.println("Введите ID:");
        int id = readNumber();
//        for (Client client : clients) {
//            if (client.getId() == id) {
//                clients.remove(client);
//            }
//        }
    }

    @Override
    public void editClient() throws IOException {
        System.out.println("Введите ID:");
        int id = readNumber();
        System.out.println("Введите имя:");
        String name = reader.readLine();
        System.out.println("Введите фамилию:");
        String surname = reader.readLine();
        System.out.println("Введите возраст:");
        int age = readNumber();
        dao.updateClient(new Client(id, name, surname, age));

    }

    @Override
    public List<Client> getAllClients() {
        return dao.getAll();
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

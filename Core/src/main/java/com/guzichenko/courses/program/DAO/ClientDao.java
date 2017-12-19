package com.guzichenko.courses.program.DAO;

import com.guzichenko.courses.program.model.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {

    private Connection connection;

    public ClientDao() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:h2:tcp://localhost/~/MyDB4", "", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addClient(Client client) {
        try (PreparedStatement ps =
                     connection.prepareStatement("insert into client (name, surname, age) values(? ,?, ?)");
        ) {
            ps.setString(1, client.getName());
            ps.setString(2, client.getSurname());
            ps.setInt(3, client.getAge());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Client> getAll() {
        try (PreparedStatement ps =
                     connection.prepareStatement("SELECT * FROM client");
        ) {

            ResultSet resultSet = ps.executeQuery();
            List<Client> clients = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                clients.add(new Client(id, name, surname, age));
            }
            return clients;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void updateClient(Client client) {
        try (PreparedStatement ps =
                     connection.prepareStatement("UPDATE client SET name = ?, surname = ?, age = ? WHERE id = ?")) {

            ps.setString(1, client.getName());
            ps.setString(2, client.getSurname());
            ps.setInt(3, client.getAge());
            ps.setLong(4, client.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

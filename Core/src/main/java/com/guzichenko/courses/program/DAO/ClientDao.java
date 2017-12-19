package com.guzichenko.courses.program.DAO;

import com.guzichenko.courses.program.model.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ClientDao {


    public void addClient(Client client) {
        try (Connection connection =
                     DriverManager.getConnection(
                             "jdbc:h2:~/MyDB3", "", "");
             Statement st = connection.createStatement();
             PreparedStatement ps =
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
}

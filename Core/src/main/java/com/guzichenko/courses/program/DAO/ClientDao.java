package com.guzichenko.courses.program.DAO;

import com.guzichenko.courses.program.model.Client;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ClientDao {


    public void addClient(Client client) {
        try (Connection connection =
                     DriverManager.getConnection(
                             "jdbc:h2:~/MyDB3", "", "");
             Statement st = connection.createStatement();
             CallableStatement ps = connection.prepareCall(
                     "SELECT * FROM user WHERE ? ");
        ) {


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

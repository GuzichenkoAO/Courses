package com.guzichenko.courses.lesson_6_JDBC;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/MyDB3", "", "");
             Statement st = connection.createStatement();
             CallableStatement ps = connection.prepareCall("SELECT * FROM user WHERE ? ");
        ) {
//            statement.execute("create table user(" +
//                    "id integer primary key auto_increment, " +
//                    "name varchar(100));");
//            statement.execute("insert into user(name) values('borya'),('petya')");

            String name = "1 = 1";
            int id = 8;


            ps.setString(1, name);
//            ps.setInt(2, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
//            }
//            rs.close();

            ResultSet rs = st.executeQuery("select * from user where " + name);

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//		try (Connection connection = DriverManager.getConnection("jdbc:h2:~/MyDB");
//				Statement statement = connection.createStatement()) {
//			statement.execute("create table user(" +
//					"id integer primary key auto_increment, " +
//					"name varchar(100));");

//			statement.execute("insert into user(name) values('borya'),('petya')");
//			ResultSet rs = statement.executeQuery("select * from user");
//			while (rs.next()) {
//				System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
//			}
//		} catch (Exception e) {
//
//		}

    }
}

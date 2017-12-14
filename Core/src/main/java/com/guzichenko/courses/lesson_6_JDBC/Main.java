package com.guzichenko.courses.lesson_6_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:h2:~/MyDB");
				Statement statement = connection.createStatement()) {
			statement.execute("create table user(" +
					"id integer primary key auto_increment, " +
					"name varchar(100));");

//			statement.execute("insert into user(name) values('borya'),('petya')");
//			ResultSet rs = statement.executeQuery("select * from user");
//			while (rs.next()) {
//				System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
//			}
		} catch (Exception e) {

		}

	}
}

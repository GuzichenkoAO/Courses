package com.guzichenko.courses.lesson_5_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.guzichenko.courses.program.model.Client;

public class Main {
	public static void main(String[] args) throws IOException {

		try (FileOutputStream file = new FileOutputStream("data.ser");
				ObjectOutputStream output = new ObjectOutputStream(file)) {

			output.writeObject(new Client(1123123, "Artem", "Guzichenko", 23));
			output.writeObject(new Client(123, "Petya", "Pupkin", 23));
		}

		try (FileInputStream file = new FileInputStream("data.ser");
				ObjectInputStream in = new ObjectInputStream(file)) {

			System.out.println(in.readObject());
			System.out.println(in.readObject());
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

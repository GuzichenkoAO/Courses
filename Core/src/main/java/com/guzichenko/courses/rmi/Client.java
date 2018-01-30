package com.guzichenko.courses.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	private Client() {
	}

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry(8081);

			Worker stub = (Worker) registry.lookup("Worker");
			String response = stub.say();

			System.out.println("response: " + response);
		}
		catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}

}

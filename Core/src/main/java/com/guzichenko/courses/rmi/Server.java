package com.guzichenko.courses.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Worker {

	@Override
	public String say() {
		return "Hello, world!";
	}

	public static void main(String args[]) {

		try {
			Server obj = new Server();
			Worker stub = (Worker) UnicastRemoteObject.exportObject(obj, 0);

			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.createRegistry(8081);
			registry.bind("Worker", stub);

			System.err.println("Server ready");
		}
		catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
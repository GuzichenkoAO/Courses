package com.guzichenko.courses.program.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.guzichenko.courses.program.model.Client;

public class CmdLineService {

	private final BufferedReader reader;
	private final ClientService clientService;
	private final ProductService productService;

	public CmdLineService(ClientService clientService, ProductService productService) {
		this.productService = productService;
		this.reader = new BufferedReader(new InputStreamReader(System.in));
		this.clientService = clientService;
	}

	public void mainMenu() throws IOException {
		boolean isWork = true;
		do {
			showMainMenu();
			String s = reader.readLine();
			switch (s) {
				case "1":
					clientMenu();
					break;
				case "2":
					productMenu();
					break;
				case "0":
					isWork = false;
					break;
				default:
					System.out.println("Неправильный ввод \n");
					break;
			}
		}
		while (isWork);
	}

	private void clientMenu() throws IOException {
		boolean isWork = true;
		do {
			showClientMenu();
			String s = reader.readLine();
			switch (s) {
				case "1":
					System.out.println("Введите имя:");
					String name = reader.readLine();
					System.out.println("Введите фамилию:");
					String surname = reader.readLine();
					System.out.println("Введите возраст:");
					int age = new Integer(reader.readLine());
					clientService.addClient(new Client(name, surname, age));
					break;
				case "2":
					clientService.editClient();
					break;
				case "3":
					clientService.removeClient();
					break;
				case "0":
					isWork = false;
					break;
				default:
					System.out.println("Неправильный ввод \n");
					break;
			}
		}
		while (isWork);
	}

	private void productMenu() throws IOException {
		boolean isWork = true;
		do {
			showProductMenu();
			String s = reader.readLine();
			switch (s) {
				case "1":
					productService.addProduct();
					break;
				case "2":
					productService.editProduct();
					break;
				case "3":
					productService.removeProduct();
					break;
				case "0":
					isWork = false;
					break;
				default:
					System.out.println("Неправильный ввод \n");
					break;
			}
		}
		while (isWork);
	}

	private static void showMainMenu() {
		System.out.println("1. Управление клиентами");
		System.out.println("2. Управление продуктами");
		System.out.println("0. Выход");
	}

	private static void showProductMenu() {
		System.out.println("1. Создать продукт");
		System.out.println("2. Изменить продукт");
		System.out.println("3. Удалить продукт");
		System.out.println("0. Назад");
	}

	private static void showClientMenu() {
		System.out.println("1. Создать клиента");
		System.out.println("2. Изменить клиента");
		System.out.println("3. Удалить клиента");
		System.out.println("0. Назад");
	}

}

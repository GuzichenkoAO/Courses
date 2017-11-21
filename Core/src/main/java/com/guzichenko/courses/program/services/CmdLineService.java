package com.guzichenko.courses.program.services;

import java.util.Scanner;

public class CmdLineService {

	private final Scanner scanner;
	private final ClientService clientService;
	private final ProductService productService;

	public CmdLineService(ClientService clientService, ProductService productService) {
		this.productService = productService;
		this.scanner = new Scanner(System.in);
		this.clientService = clientService;
	}

	public void mainMenu() {
		boolean isWork = true;
		do {
			showMainMenu();
			int s = scanner.nextInt();
			switch (s) {
				case 1:
					clientMenu();
					break;
				case 2:
					productMenu();
					break;
				case 0:
					isWork = false;
					break;
				default:
					System.out.println("Неправильный ввод \n");
					break;
			}
		}
		while (isWork);
	}

	private void clientMenu() {
		boolean isWork = true;
		do {
			showClientMenu();
			int s = scanner.nextInt();
			switch (s) {
				case 1:
					clientService.addClient();
					break;
				case 2:
					clientService.editClient();
					break;
				case 3:
					clientService.removeClient();
					break;
				case 0:
					isWork = false;
					break;
				default:
					System.out.println("Неправильный ввод \n");
					break;
			}
		}
		while (isWork);
	}

	private void productMenu() {
		boolean isWork = true;
		do {
			showProductMenu();
			int s = scanner.nextInt();
			switch (s) {
				case 1:
					productService.addProduct();
					break;
				case 2:
					productService.editProduct();
					break;
				case 3:
					productService.removeProduct();
					break;
				case 0:
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

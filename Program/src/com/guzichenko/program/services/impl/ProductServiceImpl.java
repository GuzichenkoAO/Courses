package com.guzichenko.program.services.impl;

import com.guzichenko.program.services.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public void addProduct() {
		System.out.println("Add new product");

	}

	@Override
	public void removeProduct() {
		System.out.println("Remove product");

	}

	@Override
	public void editProduct() {
		System.out.println("Edit product");
	}
}

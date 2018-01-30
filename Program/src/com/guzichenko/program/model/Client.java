package com.guzichenko.program.model;

import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = 123L;
	private transient long id;
	private String name;
	private String surname;
	private int age;

	public Client(long id, String name, String surname, int age) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public Client(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Id: " + id
				+ ", " + name + " " + surname
				+ ", возраст: " + age;
	}
}

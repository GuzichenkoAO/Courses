package com.guzichenko.courses.lesson_2;

import com.guzichenko.courses.lesson_2.sources.Pet;

public class Main {
	public static void main(String[] args) {
		Pet pet = new Pet();
		Pet otherPet = new Pet();

		System.out.println(pet.publicName);
		System.out.println(Pet.someStaticVar);

		pet.someStaticVar = 3;
		System.out.println(otherPet.someStaticVar);

		pet.go();
		pet.go(3);
	}

}

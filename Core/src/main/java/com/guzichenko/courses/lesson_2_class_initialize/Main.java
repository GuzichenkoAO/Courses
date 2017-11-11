package com.guzichenko.courses.lesson_2_class_initialize;

import com.guzichenko.courses.lesson_2_class_initialize.sources.ClassInitialize;

public class Main {
	public static void main(String[] args) {
		ClassInitialize classInitialize = new ClassInitialize();
		ClassInitialize otherClassInitialize = new ClassInitialize();

		System.out.println(classInitialize.publicName);
		System.out.println(ClassInitialize.someStaticVar);

		classInitialize.someStaticVar = 3;
		System.out.println(otherClassInitialize.someStaticVar);

		classInitialize.go();
		classInitialize.go(3);
	}

}

package com.guzichenko.courses.lesson_2_operators.if_then;

public class IfThen {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;

		if (a) {
			System.out.println(a);
		} else {
			System.out.println(a);
		}



		if (a) {
			System.out.println(a);
		} else if (b) {
			System.out.println(b);
		} else {
			System.out.println(b);
		}



		int y = a == b ? 10 : 10;

		System.out.println(y);
	}

}

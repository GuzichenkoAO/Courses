package com.guzichenko.courses.lesson_2_operators.arithmetic;

public class Unary {

	public static void main(String[] args) {

		int i = +1;
		int k = 1;
		int y = -1;

		int g = ++i;

		i = i + 1;
		y--;
		y = y - 1;

		System.out.println(g);
//		System.out.println(y);

		boolean b = true;
		System.out.println(!b);

	}
}

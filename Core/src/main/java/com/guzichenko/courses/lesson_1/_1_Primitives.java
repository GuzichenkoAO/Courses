package com.guzichenko.courses.lesson_1;

public class _1_Primitives {

	/**
	 * Logic types
	 */

	boolean aBoolean = true;    // true or false

	/**
	 * Integer types
	 */

	byte aByte = -128;      // 1 byte, from -128 to 127
	short aShort = 2;       // 2 bytes, from -32768 to 32767
	int anInt = 3;          // 4 bytes, from -2147483648 to 214748364
	long aLong = 4L;        // 8 bytes, from -9223372036854775808 to 9223372036854775807

	// Literals

	int bin = 010101010;       // int binary
	int dec = 3;               // int decimal
	int oct = 056;             // int octal
	int hex = 0x15;            // int hexadecimal
	int delimiter = 1_000_000; // with delimiters

	//long big = 9223372036854775807;   -   error because 9223372036854775807 - integer
	long big = 9223372036854775807L;

	/**
	 * With floating point
	 */

	float aFloat = 1.1f;        // 4 bytes
	double aDouble = 1.1;       // 8 bytes

	/**
	 * Character
	 */

	char aChar = 'a';
}

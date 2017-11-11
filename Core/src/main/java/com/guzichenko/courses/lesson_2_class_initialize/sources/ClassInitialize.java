package com.guzichenko.courses.lesson_2_class_initialize.sources;

//can be public or default (package-private)
public class ClassInitialize {

	/**
	 * Fields
	 */
	public String publicName;               // All can see me
	protected String protectedName = "";    // All my children can see me
	String defaultName = "";                // All classes in package can see me
	private String name;                    // Only I can see it

	static int staticvariable = 1;          // Can be accessed from Class (or from Object, but this variable is common for all objects)

	public static int someStaticVar;

	private int someVar;
	private String someString;

	/**
	 * Blocks
	 */
	static {
		System.out.println("I am static block. I'm called before the Constructor");
		System.out.println("Static variable is: " + someStaticVar);
		System.out.println();
		// System.out.println(someVar);            // Error  (Static blocks and methods can't use non static variables)
	}

	{
		System.out.println("I am block. I'm called after static blocks and before Constructor");
		System.out.println("Variable is: " + someVar);
		System.out.println("String is: " + someString);
		System.out.println("Static variable is: " + someStaticVar);         //  (non-static Blocks can use static variables)
		System.out.println();
	}

	/**
	 * Constructors
	 */
	public ClassInitialize() {
		System.out.println("I am Constructor. I am building object");
		System.out.println();
	}

	//overloaded Constructor
	public ClassInitialize(String name) {
		this.name = name;
		System.out.println("I am Constructor. I am building object");
		System.out.println();

	}

	/**
	 * Methods
	 */
	public void go() {
		System.out.println("I am walking");
	}

	//overloaded method
	public int go(int i) {
		System.out.println("I passing " + i + " meters");
		return i;
	}

	//overloaded method
	int go(int i, int j) {
		System.out.println("I passing " + i + " meters for " + j + " seconds");
		return i + j;
	}

	public static int getStaticVar() {
		return someStaticVar;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("I'm called before dying.");
	}
}

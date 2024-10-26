package MethodsOverloading;

public class Execution {
	
	public static void main(String[] args) {
		
	
	A1 x = new A1();
	x.test();
	
	B2 y = new B2();
	y.test();
	y.test(78);
	
	}
}


//Creating the object of sub class we can call the 
//both methods of super class and sub class in method overloading.
package MethodOverriding;

public class Execution {
	
	public static void main(String[] args) {
		
	Sangli x = new Sangli();
	x.test();
	
	Kolhapur y = new Kolhapur();
	y.test();
	//super class    //Sub Class
	Kolhapur z = new Sangli();
	z.test();
	
	}
}

//Inheriting the property of super class into sub class and changing 
//the implementation (body/definition) according to sub class specification
//only with non static method
package MethodsOverloading;

public class Delta {
	
	//Method
	static void test () //Method Declaration (test is method name)
	{
		//Method body / Implementation /Definition
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");

	}
	public static void main(String[] args) {
		
		test();    //Method Call
		System.out.println("d");
		
		test();    //Method call
		System.out.println("e");
		
		test();   //Method call
		System.out.println("f");
		
	}

}

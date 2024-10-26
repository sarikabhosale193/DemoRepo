package MethodsOverloading;

public class Delhi {
	
//	Method overloading => Can be possible with Static and Non-static 
//Declared multiple methods in same class with same method name but different 
//types of argument	
	
    void test() {     
		System.out.println("Hi");
	}
	void test (int x) {
		System.out.println("Hello");
	}
	void test (char y) {
		System.out.println("Bye");
	}
	void test (int x,char y) {
		System.out.println("Good Bye");
	}
	void test (int z , int x, char y) {
		System.out.println("See you");
	}
		public static void main(String[] args) {
			
			Delhi x = new Delhi();
			x.test();
			x.test(44);
			x.test('s');
			x.test(23,'a');
			x.test(43,76,'h');
		}
	}



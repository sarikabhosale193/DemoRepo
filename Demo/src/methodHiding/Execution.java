package methodHiding;

public class Execution {
	
	public static void main(String[] args) {
		
		ClassA.alpha(45);
		
		ClassB.alpha(21);
	}

}
// Declaring the static method in super class and sub class with 
// the same method name and same argument 
//only with static methods
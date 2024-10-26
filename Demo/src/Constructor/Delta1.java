package Constructor;

public class Delta1 {
	
	int f; //Global-non static variable
	// User define constructor-zero argument
	Delta1()
	{
		f=700;
	}
	public static void main(String[] args) {
		
	Delta1 x = new Delta1();  //user define constructor call
	System.out.println(x.f);
	}

}

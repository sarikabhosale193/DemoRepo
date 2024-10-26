package Constructor;

public class Delta6 {
	
	int a;
	int b;
	
	Delta6()
	{
		System.out.println("zero argument");
	}
	Delta6(int j)
	{
		System.out.println("integer argument");
	}
	Delta6(char k)
	{
		System.out.println("char argument");
	}
	Delta6(int j, char k)
	{
		System.out.println("int char argument");
	}
	Delta6(char j, int k)
	{
		System.out.println("char int argument");
	}
	Delta6(char j, int k, String l)

	{
		System.out.println("char int string argument");
	}
	
	public static void main(String[] args) {
		Delta6 x=new Delta6();
		x.a=200;
		System.out.println(x.a);
		
		Delta6 y = new Delta6(123);
		{
			
		}
		System.out.println(y.b);
		
	}
}

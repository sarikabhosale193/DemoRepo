package Constructor;

public class Delta5 {
	
	int f;   //Global+ Non Static variable
	
	//User Define constructor with integer argument
	Delta5 (int j)
	{
		f=j;
	}
	
	public static void main(String[] args) {
		
		Delta5 x = new Delta5(67667);   //User Define constructor call
		System.out.println(x.f);
		
	}

}

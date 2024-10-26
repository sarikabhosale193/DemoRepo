package pack123;

public class DeltaMethod {
	
	static int y = 4;  //Global +static
	int x = 6;         // Global + Non static
	
	//constuctor declaration
	DeltaMethod()
	{
	 	
	}

	public static void main(String[] args) {
		
		int j ;
		
		System.out.println(y);
		System.out.println(DeltaMethod.y);     //static call
		
		//system.out.println(x);
		//system.out.println(Delta.x);
		
		DeltaMethod a = new DeltaMethod ();
		//object create -> Non static declaration => x
		
		System.out.println(a.x);
	}

}

package Constructor;

public class Delta2 {
	
	static int y = 4;   //Global +static
	int x = 6;  //Global + Non static
	
	//Constructor Declaration
	Delta2()
	{
		
	}
	
	public static void main(String[] args) {
		
	    int j;   //value of j is not used
		System.out.println(y);
		System.out.println(Delta2.y);  //Static call
		
//      system.out.println(x);
//      system.out.println(Delta2.x);
		
		Delta2 a = new Delta2();  //a is object
		//Object create->Non static declarate=>x
		System.out.println(a.x);
	}

}

package pack123;

public class Array6 {
	
	public static void main(String[] args) {
		
        int a [] = {23,45,3,77,67,90};
		
		System.out.println("Original");
		for(int i = 0; i<=5; i++)
		{
			System.out.print(a[i]+ ",");
		}
		// reverse the given array
		int b [] = new int[6];
		for(int i = 0; i<=5; i++)
		{
			b[i] = a[5-i];
		}

	    //b[0] = a[5] ;  //b[0] = 90
		//b[1] = a[4] ;  //b[0] = 67
		//b[2] = a[3] ;  //b[0] = 77
		//b[3] = a[2] ;  //b[0] = 3
		//b[4] = a[1] ;  //b[0] = 45
		//b[5] = a[0] ;  //b[0] = 23
		
		a = b;
		
		a[0] = b[0];
		a[1] = b[1];
		a[2] = b[2];
		a[3] = b[3];
		a[4] = b[4];
		a[5] = b[5];
		
		System.out.println();
		System.out.println("Reverse");
		
		for(int i = 0; i<=5; i++)
		{
			System.out.print(a[i]+",");
		}
	}

}

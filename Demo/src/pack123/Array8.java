package pack123;

public class Array8 {
	
	public static void main(String[] args) {
		
		int a[] = {23,45,3,77,67,90,45,67};   //size = 8 and index = 7
		
		System.out.println("Original");
		for(int i = 0; i<=(a.length -1); i++)
		{
			System.out.print(a[i]+ ",");
		}
		int b [] = new int[8];
		for(int i = 0; i<=(a.length-1); i++)
		{
			b[i] = a[7-i];
		}
		a = b;
		System.out.println();
		System.out.println("Reverse");
		
		for(int i = 0; i<=(a.length-1); i++)
		{
			System.out.print(a[i]+",");
		}
	}

}

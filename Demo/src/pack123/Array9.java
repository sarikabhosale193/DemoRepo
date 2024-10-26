package pack123;

public class Array9 {
	
	public static void main(String[] args) {
		
		int a[] = {23,45,3,77,67,90,100,44,55};
		
		System.out.println("original");
		
		for(int i=0; i<=(a.length-1); i++)
		{
			System.out.print(a[i]+",");
		}
		
		for(int i = 0; i<(a.length/2); i++)
		{
			int x = a[i];
			a[i] = a[(a.length-1)-i];
			a[(a.length-1)-i] = x;
		}
		
		System.out.println();
		System.out.println("Reverse");
        for( int i = 0; i<=(a.length-1); i++)
        {
         System.out.print(a[i]+",");
        }
	}
}

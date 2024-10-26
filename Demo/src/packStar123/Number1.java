package packStar123;

public class Number1 {
	
	public static void main(String[] args) {
		
		int n = 1;
		
		for(int a=1; a<=4; a++)
		{
			for(int b = 4; b>a; b--)
			{
				System.out.print(" ");
			}
			  for(int c=1;c<=a;c++)
			  {
				System.out.print(n +" ");
				n++;
			  }
			    System.out.println();
		 }
	}
}

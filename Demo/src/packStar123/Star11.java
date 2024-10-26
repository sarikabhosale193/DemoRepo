package packStar123;

public class Star11 {
	
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++)
		{
			for(int b=4;b>=a; b--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a = 1; a<=5; a++)
		{
			for(int b=0; b<a;b++)
			{
				System.out.print(" ");
			}
			for(int c=4; c>=a;c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

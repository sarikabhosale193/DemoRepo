package packStar123;

public class Star4 {
	
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++)
		{
			for(int b = 0; b<a; b++)
			{
				System.out.print(" ");
			}
			for(int c=a;c<=5;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//Inverted pyramid
//* * * * *
// * * * *
//  * * *
//   * *
//    *

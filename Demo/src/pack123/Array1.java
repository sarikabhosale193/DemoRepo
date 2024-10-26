package pack123;

public class Array1 {
	
	public static void main(String[] args) {
		
		int a [] = {23, 45, 3, 77, 67, 90};    // size/length = 6
		            //0, 1 ,2, 3, 4, 5
		for (int i = 0; i<=5; i++)
		{
			// similar operation
			a[i] = a[i] + 5;
		}
		  System.out.println("===========");
		  
		  int index = 0;
		  for(int i = 1; i<=6; i++)
		  {
			  System.out.println(a[index]);
			  index++ ;
		  }
	}

}

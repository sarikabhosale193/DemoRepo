package pack123;

public class Array3 {
	
	public static void main(String[] args) {
		
		int a [] = {23, 45, 3, 77,67,90};  //size/length = 6
                   //0 , 1 ,2 ,3 ,4, 5
		
		//system.out.println(a[0]);
		//system.out.println(a[1]);
		//system.out.println(a[2]);
		//system.out.println(a[3]);
		//system.out.println(a[4]);
		//system.out.println(a[5]);
	
		for (int i = 0; i<=5; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("=========");
		
		int index = 0;
		for (int i = 1; i<=6; i++)
		{
			System.out.println(a[index]);
			index++ ;
		}
	}
	

}

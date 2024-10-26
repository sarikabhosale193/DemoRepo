package pack123;

public class Array10 {
	
	public static void main(String[] args) {
		
		//Multi-dimension array
		             //Row X => 0          1               2            3 
		int a [] [] = { {12, 34, 56}, {34, 54, 78}, {59, 78, 89}, {90, 70, 66} };
		//column / cell Y 0,   1,   2 // 0, 1, 2    // 0, 1, 2    //0,  1,  2
		
		//system.out.println(a[row][column]);
		//system.out.println(a[x][Y];
		
		System.out.println(a[3][2]);
		
		//3 dimentional array
		int b [] [] [] = { { {23,45,56},{67,89,90},{78,76,89},{76,89,99} } };
		                   // 0   1  2    0  1  2    0  1  2    0  1   2
		                   //  0            1           0           1
		                   //          0                      1
		//system.out.println(b[X][Y][Z];
		System.out.println(b[0][1][2]);
		System.out.println(b[1][0][1]);
		System.out.println(b[0][1][1]);
     
	}

}

package pack123;

public class Array {
	
	public static void main(String[] args) {
		
		// Declaration and initialization at same line
		int a []  = {23, 45, 3, 77, 67, 90, 67, 56} ;//Size/length = 8
                   //0, 1, 2,
		System.out.println(a[6]);

        a[1] = 100;
        
		System.out.println(a[1]);
		
		a[6] = 7888;  //size of array is fixed, after declaration of array the size can not be changed.
		
		System.out.println(a[6]);
		
		//Run -> 1. compilation (HL-> LL)
		//       2. Execution LL
	}

}

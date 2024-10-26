package ASCities;

public class Delhi {
	
	 public static int a = 10;
	        static int b =20;
	 private static int c = 30;
	 protected static int d = 40;
	 
	 public static void main(String[] args) {
		
		 System.out.println(Delhi.a); //public
		 System.out.println(Delhi.b); //default
		 System.out.println(Delhi.c); //private
		 System.out.println(Delhi.d); //protected
	}

}
// Private-> private property of the class can be accessible only with the class 
//           scope of private access specifier is with the class only
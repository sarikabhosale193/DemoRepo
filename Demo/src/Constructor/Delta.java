package Constructor;

public class Delta {
	    
	//no user define constructor is present
		int f; //Global - non static variable
		
		public static void main(String[] args) {
			
			Delta x = new Delta(); //Default constructor call
			x.f = 100;
			System.out.println(x.f);
			
	}

}

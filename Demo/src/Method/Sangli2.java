package Method;

public class Sangli2 {
	
    static int a = 10;  // Global static variable
           int b = 20;   // Global non static variable
           
           //this keyword is used to call the Global variable of same class when Global variable name and local variable name are same
           void add()
           {
        	 int a = 45;    
        	 int b =  75;   
        	 System.out.println(a);  //Local  
        	 System.out.println(b);    //Local 
        	 System.out.println(Sangli2.a);  //Global static
        	 System.out.println(this.a);     // Global static
        	 System.out.println(this.b);      //Global non static  x.b/y.b
           }
           public static void main(String[] args)
           {
			      
        	      Sangli2 x = new Sangli2();  //x.b
        	 	  x.b = 2000;                //x.b
        	 	  Sangli2 y = new Sangli2();   //y.b
        	 	  y.b = 7000;                //y.b
        	 	  x.add();
        	 	  System.out.println("------------------");
        	 	  y.add();
       
		}
          
           
}

package Method;

public class Sangli1 {
	
	static int a = 56;    //Global static variable
    int b = 78;    //Global non static variable
    
    
    void add()
    {
 	   int s = 34;    
 	   int d = 76;    
 	   System.out.println(s);  //Local variable 
 	   System.out.println(d);   //Local variable
 	   System.out.println(a);   //Global static variable
 	   System.out.println(b);    // Global non static variable
 	   
    }
    
    public static void main(String[] args) {
		
 	  Sangli1 x = new Sangli1();
 	  x.b = 2000;
 	  Sangli1 y = new Sangli1();
 	  y.b = 7000;
 	  x.add();
 	  System.out.println("------------------");
 	  y.add();

    }
}

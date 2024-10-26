package Method;

public class Hupari {
	
	static int a = 10;
	       int b = 90;
	       
	       void add() 
	       {
	    	   System.out.println(a);
	    	   System.out.println(Hupari.a);
	    	    //we can call non static variable in non static method directly 
	    	  System.out.println(b); 
	       }
	    	  
	       public static void main(String[] args) {
	    	 
	    	   Hupari x = new Hupari();
	    	   x.b = 2000;
	    	   Hupari y = new Hupari();
	    	   y.b = 7000;
	    	   
	    	   x.add();  //x.b
	    	   y.add();   //y.b
	    	   
		}

}

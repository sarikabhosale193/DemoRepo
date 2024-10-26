package Method;

public class Mumbai {
	
	static int a = 23;   //Global static variable
	       int b = 78;   //Global non static variable
	       
    static Mumbai x;  //Global static object reference
    
    static void add()
    {
    	System.out.println(a);
    	System.out.println(Mumbai.a);
    	System.out.println(x.b);
    	//System.out.println(b);
    }
    
    public static void main(String[] args) {
		
         x = new Mumbai();  //x is local object reference
    	Mumbai.add();
	}
	       

}

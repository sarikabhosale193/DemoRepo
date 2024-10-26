package Method;

public class Delhi {
	
	static int a = 12;  //Global static variable
	        int b = 54;  //Global non static variable
	        
	        //static Delhi x;    //Global static object reference
	        static void add ()
	        {
	          System.out.println(a);
	          System.out.println(Delhi.a);
	          
	          Delhi x = new Delhi();      // x is local object reference
	          System.out.println(x.b);
	          //System.out.println(fdghhjh.jhhg);
	        }
	        public static void main(String[] args) {
	          //System.out.println(x.b);
	        	
			Delhi.add();
			  
	        }
	}

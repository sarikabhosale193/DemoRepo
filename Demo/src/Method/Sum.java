package Method;

public class Sum {

	static int add(int x, int y) {
		int c;
		c = x+y;
		return c;
	}
	public static void main(String[] args) {
		 
		int sum = add(23,45);
		    sum = add(34,sum);
		    sum = add(87,sum);
		    sum = add(67,sum);
		    System.out.println(sum);
	}
}

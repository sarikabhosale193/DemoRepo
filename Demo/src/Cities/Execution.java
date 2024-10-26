package Cities;

public class Execution {

	public static void main(String[] args) {
		
		// Normal call
		Delhi.test('&');
		System.out.println(Delhi.a);
		
		Delhi x = new Delhi();
		x.demo();
		System.out.println(x.b);
		
		Hydrabad.set();
		System.out.println(Hydrabad.c);
		
		Hydrabad y = new Hydrabad();
		y.get();
		System.out.println(y.d);
		
		System.out.println("================");
		
		//inheritance call
		Hydrabad.test('%');
		System.out.println(Hydrabad.a);
		
		y.demo();
		System.out.println(y.b);
		System.out.println(y.b);
		}
}

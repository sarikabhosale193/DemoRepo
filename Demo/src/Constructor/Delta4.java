package Constructor;

public class Delta4 {
	
	float f;    //Global + non - static
	//User Define constructor- zero argument
	Delta4()
	{
		f=123.23f;
	}
	
	public static void main(String[] args) {
		
		Delta4 x = new Delta4();
		System.out.println(x.f);
	}

}

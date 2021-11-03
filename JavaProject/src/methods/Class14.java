package methods;

public class Class14 {

	public static void main(String[] args) {
		Class14 c=new Class14();
		c.addTwoNUmbers();
		multiplyTwoNumbers();
		c.addTwoNumbers_();
		System.out.println(c.multiply3Numbers());
		System.out.println(c.addTwoNumbers_());
		
		

	}
	void addTwoNUmbers() // non-static method
	{
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	static void multiplyTwoNumbers()// static block
	{
		int a = 10;
		int b = 20;
		System.out.println(a * b);
	}

	int addTwoNumbers_() {

		int a = 10, b = 20;
		int c = a + b;
		return c;
	}

	static int multiply3Numbers() {
		int a = 2, b = 3, c = 4;
		return a * b * c;

	}
}

package exceptions;

public class AexceptionClass {
	static AexceptionClass aE;

	public static void main(String[] args) {
		AexceptionClass ae = new AexceptionClass();
		// ae.arithmeticException();
		// ae.numFormatException();
		try {
			aE.nullPointerException();
		} catch (NullPointerException e) {

			e.printStackTrace();
		}
		System.out.println("hello");

	}

	public void arithmeticException() {
		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);

		} catch (ArithmeticException e) {

			e.printStackTrace();// is a method present in exception class
		}
		System.out.println("From java");
		System.out.println("Name");
	}

	public void numFormatException() {
		String name = "123";
		int a = 30;
		int b = a;
		System.out.println(b);
		int c = 0;
		try {
			c = Integer.parseInt(name);
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
		System.out.println(c);
	}

	public void nullPointerException() {
		System.out.println("hello");
	}

}

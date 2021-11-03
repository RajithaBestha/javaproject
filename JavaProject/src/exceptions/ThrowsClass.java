package exceptions;

public class ThrowsClass {
	public void m1(int a, int b) throws ArithmeticException {
		System.out.println(a / b);

	}

	public static void main(String[] args) {
		ThrowsClass t = new ThrowsClass();
		try {
			t.m1(20, 0);
		} catch (ArithmeticException e) {

			e.printStackTrace();
		}
		System.out.println("Program End");

	}


}

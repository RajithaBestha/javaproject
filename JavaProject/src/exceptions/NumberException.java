package exceptions;

public class NumberException {
	public static void main(String[] args) {
		String name = "Rajitha";
		int a = 10;
		int b = a;
		System.out.println(b);

		try {
			int c = Integer.parseInt(name);
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
		System.out.println("Catched the exception");
	}

}

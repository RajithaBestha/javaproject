package exceptions;

public class NullException {
	static NullException ne;

	public static void main(String[] args) {
		try {
			ne.nullPointerException();
		} catch (NullPointerException e) {

			e.printStackTrace();
		}
		System.out.println("abc!!");

	}

	public void nullPointerException() {
		System.out.println("Hi!!");
	}

}

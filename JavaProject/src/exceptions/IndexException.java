package exceptions;

public class IndexException {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		try {
			a[4] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
		}
		System.out.println("exception handled");

	}

}

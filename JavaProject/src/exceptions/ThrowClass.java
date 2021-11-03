package exceptions;

import java.util.Scanner;

public class ThrowClass {
	public static void main(String[] args) {
		ThrowClass t = new ThrowClass();
		try {
			t.bankSbi();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("End");
			System.out.println("Connection closed");
		}

	}

	public void bankSbi() {
		String pwd = "Rajitha";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Password");
		String s = scan.next();
		if (s.equalsIgnoreCase(pwd)) {
			System.out.println("Success");
		} else {
			throw new ArithmeticException("wrong password");
		}

	}

}

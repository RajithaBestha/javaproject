package methods;
import java.util.Scanner;
public class Class8 {

	public static void main(String[] args) {
		int age = 20;
		String name = "Rajitha";
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "is even number");
				Scanner s = new Scanner(System.in);
				System.out.println("enter your age:");
				int a = s.nextInt();
				if (age == a) {
					System.out.println("your age is:" + a);
					break;
				} else {
					System.out.println("do not break");
				}
			} else {
				System.out.println(i + "is odd number");
				Scanner s = new Scanner(System.in);
				System.out.println("enter your name:");
				String n = s.next();
				if (name.equals(n)) {
					System.out.println("your name is:" + n);
					break;
				} else {
					System.out.println("do not break");
				}

	}

		}
		}
	}

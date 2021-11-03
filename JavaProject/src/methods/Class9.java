package methods;
import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		Class9 c=new Class9();
Scanner scan=new Scanner(System.in);
		
		int result = 0;
		int input = 0;

		for (;;) {

			System.out.println("please enter the number");
			input = scan.nextInt();
			result = result + input;
			System.out.println("entered result is:" + result);
			if (result >= 20) {
				System.out.println(result);
				break;
			}
		}
	}

}

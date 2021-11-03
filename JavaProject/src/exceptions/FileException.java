package exceptions;

import java.io.FileInputStream;


public class FileException {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
			String projectPath = System.getProperty("user.dir");
			System.out.println(projectPath);
			try {
				FileInputStream fis = new FileInputStream(projectPath + "/file/rajitha.xlsx");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (ArithmeticException e) {

			e.printStackTrace();
		}

	}

}

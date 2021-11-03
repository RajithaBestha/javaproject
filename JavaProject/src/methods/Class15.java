package methods;

public class Class15 {

	public static void main(String[] args) {
		Class15 c=new Class15();
		c.add();
		c.addNumbers();

	}
	int add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	void addNumbers() {
		int d = 30;
		int e = add() + d;
		System.out.println(e);
	}
}

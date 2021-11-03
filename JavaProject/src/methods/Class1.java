package methods;

public class Class1 {

	public static void main(String[] args) {
	Class1 c=new Class1();
	staticmethod();
	c.nonstaticmethod();

	}
	public static void staticmethod() {
		System.out.println("static method");
	}
	public void nonstaticmethod() {
		System.out.println("non-static method");
	}

}

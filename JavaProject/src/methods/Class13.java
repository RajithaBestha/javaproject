package methods;

public class Class13 {
	final static String servername="Java";
	final int serverPortNumber=1002;

	public static void main(String[] args) {
		Class13 c=new Class13();
		System.out.println(c);
		final Class2 c2=new Class2();
		System.out.println(c2);
		final int a=10;
		System.out.println(a);
		System.out.println(servername);
		System.out.println(c.serverPortNumber);

	}
	public void non_FinalMethod() {
		System.out.println("non final method");
	}
	public void finalmethod() {
		System.out.println("final method");
	}

}

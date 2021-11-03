package methods;

public class Class11 {
	Class11(){
		this(10);
		System.out.println("constructor without parameter");
	}
	Class11(int a){
		System.out.println("constrctor with parameter");
		
	}

	public static void main(String[] args) {
		new Class11();
		new Class11(10);

	}

}

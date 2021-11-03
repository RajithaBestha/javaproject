package methods;

public class Class2 {
	public static void main(String[] args) {
		Class2 c=new Class2();
		c.oneDimArray();
		System.out.println("*******");
        c.twoDimArray();
	}
public void oneDimArray() {
	int[] a=new int[3];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	System.out.println(a[1]);
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);}
}
public void twoDimArray() {
	int[][] b=new int[2][3];
	b[0][0]=10;
	b[0][1]=20;
	b[0][2]=30;
	b[1][0]=40;
	b[1][1]=50;
	b[1][2]=60;
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[i].length;j++) {
			System.out.println(b[i][j]);
		}
	}

}
}

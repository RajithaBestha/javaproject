package methods;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		Class7 c=new Class7();
       // c.doWhileStatement();
       // c.jumb_break();
        c.scannerClass();
	}
//*************************************
	public void doWhileStatement() {
		int i=0;
		do {
			System.out.println("inside do while block");
			i=i+1;
		} while(i <=1);
	         }
//***************************************	
	public void jumb_break() {
		String s="ABCD";
		System.out.println(s.length());
		for(int i=0;i<10;i++) {
			System.out.println("value of is=" +i+ "outer block");
			if(i==6) {
				System.out.println("entered if block -inner block");
				break;
			}
		}
	}
//****************************************
	public void scannerClass() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter user name");
		String s1=scan.next();
		System.out.println("user name is"+ s1);
	}
}

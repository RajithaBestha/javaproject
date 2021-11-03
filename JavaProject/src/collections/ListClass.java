package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListClass {

public static void main(String[] args) 
{
	//concept();
	syncArrayList();

	}
public static void concept() {
	ArrayList<String> lis=new ArrayList<String>();
	lis.add(null);
	lis.add("Java");
	lis.add("Java1");
	lis.add("Java3");
	lis.add("Java");
	lis.set(3, "java4");
	lis.add(null);
	lis.add(null);
	lis.add(null);
	int i=0;
	for(String s:lis) {
		if(s==null) {
			System.out.println("i ="+ i);
			lis.set(i,"simplify");
		}
		i=i+1;
	}
	System.out.println(lis);
	ArrayList<String> lis1=new ArrayList<String>();
	lis1.add(null);
	lis1.add("Java");
	lis1.add("Java1");
	lis1.add("Java2");
	lis1.add("Java3");
	lis1.add("java");
	//lis1.retainAll(lis);
	//System.out.println(lis1);
System.out.println("****************");	
	ArrayList<String> lis3=new ArrayList<String>();
	lis3.add("ABC");
	lis3.add("Xyz");
	lis3.add("Lmn");
	lis3.add("CFD");
	lis3.add("JKL");
	lis3.add("123");
	lis3.add("A123");
	
	
Collections.sort(lis3);
System.out.println( "sorted order= "+lis3);

Collections.sort(lis3,Collections.reverseOrder());
System.out.println("reverse sorted order= "+lis3);

  ArrayList<Object> b=new ArrayList<Object>(lis3.subList(1,3));
System.out.println(b);

//converting arraylist to array
 Object c[]=lis3.toArray();
 System.out.println(Arrays.toString(c));
 
}
public static void syncArrayList() {
	List<String> l=Collections.synchronizedList(new ArrayList<String>());
	l.add("javac command");
	l.add("kjdsklk");
	l.add("fkndknl");
	l.add("hdddwkw");
	l.add("dkejdlkkwdw");
	l.add("hijdodwkdw");
	System.out.println(l);
	synchronized(l) {
		for(String s:l) {
			System.out.println(s);
		}
	}
}
















}

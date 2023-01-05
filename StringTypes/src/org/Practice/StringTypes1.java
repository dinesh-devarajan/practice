package org.Practice;

public class StringTypes1 {
	public static void main(String[] args) {
		
		//Non Literal
		//Stored in Heap Memory
		
		String a=new String("Dinesh");
		String a1=new String("Dinesh");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a1));
		
		
		System.out.println("___________________________");

		//Mutable
		StringBuffer b=new StringBuffer("Dinesh");
		StringBuffer b1=new StringBuffer("Dinesh");
		
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(b1));
		//Append
		StringBuffer append = b.append(b1);
		System.out.println(append);
		
		System.out.println(System.identityHashCode(append));
		
		
	}

}

package org.Practice;

public class Practice {
	public static void main(String[] args) {
		
	//Literal or immutable string
	// Stored in String pool constant
	String s="welcome";
	String s1="welcome";
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));

	String concat = s.concat(s1);
	System.out.println(concat);
	System.out.println(System.identityHashCode(concat));
	
	}
}

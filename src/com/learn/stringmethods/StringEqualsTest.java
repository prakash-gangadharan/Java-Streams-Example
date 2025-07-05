package com.examples.stringhandling;

/**
 *  Both equals() method and == operator is used to compare two objects in Java.
 *  
 *  But == operator compare reference or memory location of objects in heap
 *  
 *  == operator used to compare data of primitive data types.
 *  
 *
 */

//Equals
class StringEqualsTest {
	public static void main(String args[]) {

		String s1 = "hello";
		String s2 = "hello";

		String o1 = new String("hello");
		String o2 = new String("hello");

		String s3 = "good";
		String s4 = "HELLO";

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // true

		System.out.println(s1 == o1 ); // false
		
		System.out.println(o1.equals(o2)); // true
		System.out.println(o1 == o2); // false

		System.out.println(s2.equals(s3)); // false
		System.out.println(s2.equals(s4)); // false
		System.out.println(s2.equalsIgnoreCase(s4)); // true
		System.out.println((s4 == s2)); // false
	}
}


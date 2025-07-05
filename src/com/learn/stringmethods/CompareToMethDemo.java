package com.learn.stringmethods;

//compareTo Method
class CompareToMethDemo {
	public static void main(String args[]) {
		String a = "A";
		String b = "B";
		String c = "C";
		String c1 = "C";
		String d = "D";
		
		// Yields less than 0 if the argument is a string lexicographically greater than this string;
		System.out.println(a.compareTo(b)); // -1

		// Yields 0 if the argument is a string lexicographically equal to this string;
		System.out.println(c.compareTo(c1)); // 0
		
		// Yields a value greater than 0 if the argument is a string lexicographically 
		// less than this string.
		System.out.println(b.compareTo(a)); // greater than 0
		System.out.println(c.compareTo(a)); // greater than 0
		System.out.println(d.compareTo(a)); // greater than 0
	}
}
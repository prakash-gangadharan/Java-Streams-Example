package com.examples.stringhandling;

public class StringConstructors {

	public static void main(String[] args) {
		char c[] = { 'A', 'P', 'P', 'E', 'D', 'O' };
		System.out.println(c);

		String s1 = new String(c);
		System.out.println(s1);

		String s2 = new String(s1);
		System.out.println(s2);

		String s3 = new String("Appedo");
		System.out.println(s3);

		String s4 = new String(c, 2, 3);
		System.out.println(s4);
	}

}

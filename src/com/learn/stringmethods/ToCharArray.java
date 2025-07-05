package com.examples.stringhandling;

class ToCharArray {
	public static void main(String args[]) {
		String s = "ThisisaTestString";
		char c[] = s.toCharArray();
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
	}
}
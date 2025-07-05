package com.examples.stringhandling;

class StringTest {
	public static void main(String args[]) {
		try {
			String s = "prakash";
			s.concat(" gangadharan");

			System.out.println(s);

			s = s.concat(" gangadharan");

			System.out.println(s);

			// System.exit(1);
		} finally {
			// System.out.println("finally");
		}
	}
}

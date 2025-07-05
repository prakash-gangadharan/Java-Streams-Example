package com.learn.stringmethods;

//ConcatString
class ConcatString {
	public static void main(String args[]) {
		String s1 = "one";
		String s2 = "two";
		String s = s1.concat(s2);
		System.out.println(s);
		String plus = s1 + " " + s2;
		System.out.println(plus);

	}
}
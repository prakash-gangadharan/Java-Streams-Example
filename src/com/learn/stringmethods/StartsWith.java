package com.learn.stringmethods;

class StartsWith {
	public static void main(String args[]) {
		String s = "Foobar";
		System.out.println(s.startsWith("Foo"));
		System.out.println(s.startsWith("bar", 3));
		System.out.println(s.endsWith("bar"));

	}
}
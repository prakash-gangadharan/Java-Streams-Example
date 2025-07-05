package com.learn.stringmethods;

class StringConstructor {
	public static void main(String args[]) {
		char c[] = { 'j', 'a', 'v', 'a', 'p', 'r', 'o', 'g' };
		String s1 = new String(c);
		String s = new String(c, 1, 4);
		String obj = new String("HEllo worlds");
		System.out.println(s1);
		System.out.println(s);
		char buff[] = new char[5];
		s1.getChars(1, 3, buff, 0);
		System.out.println(buff);
		System.out.println(obj);
		System.out.println(obj.length());// length

	}
}

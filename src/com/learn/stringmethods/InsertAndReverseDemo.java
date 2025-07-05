package com.learn.stringmethods;

public class InsertAndReverseDemo {

	public static void main(String[] args) {
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		sb.insert(2, "eeee");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
	}

}

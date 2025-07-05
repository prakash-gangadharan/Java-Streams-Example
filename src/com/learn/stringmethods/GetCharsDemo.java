package com.learn.stringmethods;

public class GetCharsDemo {

	public static void main(String[] args) {
		String s = "This is the demo for getChars method";
		char buff[] = new char[10];
		s.getChars(5, 10, buff, 0);
		System.out.println(buff);

		int start = 5;
		int end = 15;
		char buf[] = new char[end - start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
	}

}

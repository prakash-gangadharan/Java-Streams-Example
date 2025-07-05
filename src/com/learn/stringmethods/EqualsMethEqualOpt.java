package com.learn.stringmethods;

//Equals Method versus Equal Operator;
//---------------------------------------
class EqualsMethEqualOpt {
	public static void main(String args[]) {
		String s1 = "hello";
		String s2 = s1;
		String s3 = new String(s2);
		System.out.println(s1 + "   " + s2 + "    " + s3);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));// Equals Method versus Equal Operator
											// diffrnce;
	}
}
package com.examples.stringhandling;

class A {
	int roll;
	String name;

	A(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public String toString() {
		return roll + " : " + name;
	}
}

class toString {
	public static void main(String[] args) {
		A o = new A(101, "prakash");
		A o1 = new A(102, "johnson");
		A o2 = new A(103, "palani");
		System.out.println(o);
		System.out.println(o1);
		System.out.println(o2);
	}
}
package com.learn.stringmethods;

class IndexOfDemo {
	public static void main(String args[]) {
		String s = "Now is the time for all good the men";
		System.out.println(s);
		System.out.println(s.indexOf('o'));
		System.out.println(s.lastIndexOf('o', 21));
		System.out.println(s.indexOf("the"));
		System.out.println(s.lastIndexOf("the", 21));
		System.out.println(s.lastIndexOf('z'));
		
		System.out.println("http://localhost:8081/Appedo-VelocityUI/wpt/result/161019_5H_6X/1/breakdown/".endsWith("breakdown/"));
		System.out.println("http://localhost:8081/Appedo-VelocityUI/wpt/result/161019_5H_6X/1/domains/".endsWith("domains/"));
		System.out.println("");
		
	}
}

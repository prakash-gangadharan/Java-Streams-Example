package com.examples.stringhandling;

class SubString {
	public static void main(String args[]) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		String s1 = s.substring(5);
		String s2 = s.substring(5, 10);
		System.out.println(s1);
		System.out.println(s2);
		
		
		String url = "https://dev2-wpt.appedo.com/result/160113_5H_17/1/breakdown/";
		// TODO Prakash, replace `https://wpt.appedo.com/` as `https://apm.appedo.com/appedo/wpt/`
		
		url.replace("https://wpt.appedo.com/", "https://apm.appedo.com/appedo/wpt/");
		
		System.out.println(url);

	}
}
package com.learn.stringmethods;

class ReplaceString {
	
	public static void replaceAll(StringBuilder sb, String toReplace, String replacement) {
		int index = -1;
		while ((index = sb.lastIndexOf(toReplace)) != -1) {
			sb.replace(index, index + toReplace.length(), replacement);
		}
	}
	
	public static void main(String args[]) {
		String s = "Hello";
		String s1 = "I bought car Yesterday car car car yes it is car";
/*		System.out.println(s.replace('l', 'w'));
		System.out.println(s.replace("Hello", "welcome"));
		System.out.println(s1.replace("car", "bike"));*/
		s1 = s1.replace("car", "can");
		
		System.out.println(s1);
		
		String testUrlStringI  = "url('/".replace("url('/", "url('/images/progress.gif'");
		String testUrlStringII = "url(/".replace("url(/", "url("+"www.google.com");
		
		System.out.println(testUrlStringI);
		System.out.println(testUrlStringII);
		
		String test = "[\"total disk space\"]";
		System.out.println(test.replace("[","").replace("]", ""));
		
		String msg = "Available in KB &gt;=";
		String msg1 = "Available in KB &lt;=";
		
/*		System.out.println(msg.replace("&gt;=", ">"));
		System.out.println(msg1.replace("&lt;=", "<"));*/
		
		System.out.println(msg.replace("&gt;=", ">").replace("&lt;=", "<"));
		System.out.println(msg1.replace("&gt;=", ">").replace("&lt;=", "<"));
		
		
		//		strCounters = sb.re.toString().replaceAll("&gt;", ">").replaceAll("&lt;", "<");
		StringBuilder sb = new StringBuilder("total disk space &gt; ddvdv &gt; bdbdb &lt; dfbadbzd &gt; &lt; jbjb  &lt;");
		/*
		System.out.println(sb.indexOf("&gt;"));
		System.out.println(sb.indexOf("&lt;"));
		sb.replace(sb.indexOf(str), 4, "yyyyy");
		*/
		ReplaceString.replaceAll(sb, "&gt;", ">");
		ReplaceString.replaceAll(sb,"&lt;", "<");
		
		System.out.println(sb);
	}
}
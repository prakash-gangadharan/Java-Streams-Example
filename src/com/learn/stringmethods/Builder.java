package com.learn.stringmethods;

/*
 * StringBuffer is mutable,
 * The object created through StringBuffer is stored in the heap, 
 * each method in StringBuffer is synchronized ,  
 * it is thread safe.
 * 
 * 
 * StringBuilder  - not thread safe,
 * StringBuilder is fast as it is not thread safe .  
 */
public class Builder {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: "
				+ (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: "
				+ (System.currentTimeMillis() - startTime) + "ms");

	}

}

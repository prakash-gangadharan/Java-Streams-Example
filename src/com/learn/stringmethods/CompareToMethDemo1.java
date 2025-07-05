package com.learn.stringmethods;

//compareTo Method
class CompareToMethDemo1 {
	public static void main(String args[]) {
		int i, j;
		String a[] = { "kiran", "saran", "arun", "tamil", "mani", "rani" };
		for (i = 0; i < a.length; i++) {

			for (j = i + 1; j < a.length; j++) {

				if (a[j].compareTo(a[i]) < 0) {
					String t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.println(a[i]);
		}

	}
}
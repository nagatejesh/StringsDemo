package com.cts;

public class StringVsStringBuffer {

	public static void testString() {
		String s = "new";
		for (int i = 0; i < 10000; i++)
			s = s + "new";
	}

	public static void testStringBuffer() {
		StringBuffer sb = new StringBuffer("new");
		for (int i = 0; i < 10000; i++)
			sb.append("new");
	}

	public static void main(String[] args) {

		long millis = System.currentTimeMillis();
		testString();
		System.out.println(System.currentTimeMillis() - millis);

		millis = System.currentTimeMillis();
		testStringBuffer();
		System.out.println(System.currentTimeMillis() - millis);
	}

}

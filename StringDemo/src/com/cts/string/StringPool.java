package com.cts.string;

public class StringPool {

	public static void main(String[] args) {

		String str = new String("hello");
		// both str1 and str2 points to same literal in string pool
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "hi";		
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		
//		System.out.println("Current address: " + VM.current().addressOf(str));
		
		
	}

}

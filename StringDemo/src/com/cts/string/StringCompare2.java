package com.cts.string;

public class StringCompare2 {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = "Hello";
		
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s1==s4); //false
	}

}

package com.cts.string;

public class StringCompare1 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = "hello";
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s4)); //false
		
		System.out.println(s1.equalsIgnoreCase(s4)); //true

	}

}

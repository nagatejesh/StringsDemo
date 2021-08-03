package com.cts.string;

public class StringCompare3 {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hi";
		String s3 = "hello";
		
		System.out.println(s1.compareTo(s2)); 
		//-4	(s1<s2) In dictionary order, hello comes before hi
		System.out.println(s1.compareTo(s3)); //0	(s1==s3)
		System.out.println(s1.compareTo("act")); //7	(s1>"act")
	}
}

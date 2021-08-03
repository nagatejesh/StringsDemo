package com.cts.string;

public class ImmutableString {

	public static void main(String[] args) {
		String s = "Good";
		String s2 = "Good";
		s.concat("Morning");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		s=s.concat("Morning");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

	}
}

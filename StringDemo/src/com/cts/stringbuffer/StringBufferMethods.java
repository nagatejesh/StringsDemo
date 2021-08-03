package com.cts.stringbuffer;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("Good");
		StringBuffer s2 = new StringBuffer("Morning");
		s1.append(s2);
		System.out.println(s1);
		s1.insert(4, s2);
		System.out.println(s1);
		s1.replace(4, 11, " ");
		System.out.println(s1);
		s1.delete(0, 5);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		System.out.println(s1);
		System.out.println(s2.substring(0, 4));
		
	}

}

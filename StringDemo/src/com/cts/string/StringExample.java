package com.cts.string;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "welcome ";
		String s2 = new String();
		System.out.println(s2);
		s2 = "to ";
		char[] ch = {'j','a','v','a','.'};
		String s3 = new String(ch);
		byte[] bytes = {66,65,68};
		String s4 = new String(bytes);
		String s5 = new String("Good ");
		String s6 = new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}

}

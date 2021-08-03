package com.cts.string;

import java.util.Locale;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Good";
		String str = "go";
		String string = "Morning";
		
		System.out.println("Character at index 1 of "+s+":"+s.charAt(1));
		System.out.println("Length of the String:"+s.length());
		System.out.println("format:"+String.format("String is %10d", 100));
		System.out.println("substring from 4:"+string.substring(4));
		System.out.println("substring from 0 to 3:"+string.substring(0, 3));
		System.out.println(s+" contains "+str+"?"+s.contains(str));
		System.out.println(s+" contains oo?"+s.contains("oo"));
		System.out.println(s.equals("good"));
		System.out.println(s.equalsIgnoreCase("good"));
		System.out.println(s.concat(string));
		System.out.println(10+20+s+string+30+40);
		
	}

}

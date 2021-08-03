package com.cts.string;

public class StringMethods2 extends Object{

	public static void main(String[] args) {
		String s = "Good";
		String str = "go";
		String string = "Hello World! My name is Java";
		
		System.out.println(s.replace('o', 'f'));
		System.out.println(s.replace("Go", str));
		System.out.println(s.replaceAll("o", "a"));
		String[] strings = string.split(" ");
//		System.out.println(strings.toString());
		for (String string2 : strings) {
			System.out.println(string2);
		}
		System.out.println(String.join("-",strings));
		System.out.println(string.indexOf('l'));
		System.out.println(string.indexOf('l',10));
		System.out.println(string.indexOf("or",-10));
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
//		String valueOf = String.valueOf(100);
		System.out.println(String.valueOf(100));
		
	}
}

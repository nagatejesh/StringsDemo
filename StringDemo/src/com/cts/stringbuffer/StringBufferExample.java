package com.cts.stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer();
		StringBuffer s2 = new StringBuffer("Hello");
		StringBuffer s3 = new StringBuffer(32);
		
		System.out.println(s.hashCode());
		s.append("hello");
		System.out.println(s);
		System.out.println(s.hashCode());
		
	}

}

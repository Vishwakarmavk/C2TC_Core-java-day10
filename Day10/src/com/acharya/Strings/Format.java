package com.acharya.Strings;

public class Format {

	public static void main(String[] args) {
		String s1="RCB";
		String s2=String.format("%s", s1);
		String s3=String.format("%f", 32.33434);
		String s4=String.format("%16.12f", 32.33434);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		

	}

}

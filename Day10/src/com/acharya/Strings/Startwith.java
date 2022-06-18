package com.acharya.Strings;

public class Startwith {

	public static void main(String[] args) {
		String s1="Wano arc";
		System.out.println(s1.startsWith("W"));
		System.out.println(s1.startsWith("arc"));
		System.out.println(s1.startsWith("Wan"));
		System.out.println(s1.startsWith("arc", 5));

	}

}

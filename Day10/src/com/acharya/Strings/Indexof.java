package com.acharya.Strings;

public class Indexof {

	public static void main(String[] args) {
		String s1="This is key word";
		int index1=s1.indexOf("is");
		System.out.println(index1);
		int index2=s1.indexOf("key");
		int index3=s1.indexOf("s");
		System.out.println(index2);
		System.out.println(index3);
		int index4=s1.indexOf("s", 4);
		System.out.println(index4);

	}

}

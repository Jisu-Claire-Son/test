package com.javaex.jisu.practice.chapter03;

public class StringEqualsExample {	//	문자열 비교

	public static void main(String[] args) {
		String strVar1 = "손지수";
		String strVar2 = "손지수";
		String strVar3 = new String("손지수");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
	}

}

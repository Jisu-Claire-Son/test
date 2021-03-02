package com.javaex.practice01;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
//		Problem01();
		Problem02();
	}
	
	private static void Problem01() {
		//	1에서 100까지의 수에서 5의 배수이면서 7의 배수인 수를 출력.	
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) continue;
			System.out.println(i);
		}
	}
	
	private static void Problem02() {
		int rowCount = 7;
		
		for(int row = 1; row <= rowCount; row ++) {
			for(int col = 1; col <= row; col ++) {
				System.out.println(row);
			}
			System.out.println();	//	개행
		}
	}
	
	private static void Problem03() {
		Scanner scanner = new Scanner(System.in);
		
	}

}

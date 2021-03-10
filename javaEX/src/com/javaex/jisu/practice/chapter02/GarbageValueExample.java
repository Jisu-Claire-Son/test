package com.javaex.jisu.practice.chapter02;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0; i < 5; i++) {	//	for 중괄호 {}블록을 5회 반복 실행
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t"+  "var2: " + var2);
		}
		//	byte면수는 127을 넘어서는 순간 최소값인 -128부터 다시 저장
		//	int타입의 변수는 정상적으로 1 증가된 값을 계속 저장

	}

}

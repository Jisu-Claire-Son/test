package com.javaex.jisu.practice.chapter02;

public class FromeInttToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); 
//		결과 값이 -4가 나온 이유
//		int값을 float타입으로 자동 변화하며서 문제가 발생
//		float 타입은 -> float : 부호(1비트) + 지수(8비트) + 가수(23비트) 로 비트 수가 할당되어 있다.
//		int값을 손실 없이 float타입의 값으로 변화할 수 있으려면 가수 23비트로 표현 가능한 값이어야 한다.
//		123456780은 23비트로 표현할 수 없기 때문에 근사치로 변환된다.
//		float값을 다시 int타입으로 변환하면, 원래의 int값을 더지 못한다 따라서 num1과 num2는 동일한 값이 아니다.
//		해결책은 모든 int 값을 실수 타입으로 안전하게 변환시키는 double타입을 사용하는 것.
		

	}

}

package com.javaex.jisu.practice.chapter03;

public class OverFlowExample {	//	오버 플로우

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		//변수 x와 y는 int타입이고 x*y역시 int타입이므로 연산의 산출 타입은 int 타입
		//위 코드는 컴파일 에러가 발생하지는 않지만 변수 z에는 올바른 값이 저장되지 않는다.
		//그 이유는 1000000*1000000은 10의6승 * 10의6승 = 10의12승 이 되어 int타입에 저장될 수 있는 값의 범위를 초과하게 된다.
		//그래서 쓰레기 값인 -727379968을 얻게 됨.
		//올바른 값을 얻기 위해서는 변수 x와 y중 최소 하나라도 long타입이 되어야 하고, 변수 z가 long타입이어야 한다.
		
	}
	
	
	
	

}

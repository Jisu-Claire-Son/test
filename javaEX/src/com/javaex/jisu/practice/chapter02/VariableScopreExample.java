package com.javaex.jisu.practice.chapter02;

public class VariableScopreExample {

	public static void main(String[] args) {
		int v1 = 15;
			if(v1>10) {
				int v2 = v1 - 10;
			}
//			int v3 = v1 + v2 + 5;	//	v2 면수를 사용할 수 없기 때문에 컴파일 에러가 생김
			// v2가 선언된 곳은 if블록 내부인 8라인이므로 if블록 바깥족인 10라인에서는 사용할 수 없다.
			// 하지만 v1은 6라인에 선언 되었기 때문에 main()메소드 내부 어디에서든 사용 가능
	}

}

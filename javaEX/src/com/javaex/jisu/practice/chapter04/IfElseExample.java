package com.javaex.jisu.practice.chapter04;

public class IfElseExample {	//	if ~ else문

	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		} else {	//	<- score < 90일 경우
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다");
		}
	}

}

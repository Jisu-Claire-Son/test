package com.javaex.jisu.practice.chapter04;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 100-90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score>=80) {
			System.out.println("점수가 90-80입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score>=70) {
			System.out.println("점수가 80-70입니다.");
			System.out.println("등급은 C입니다.");
		}else{
			System.out.println("점수가 70미만 입니다.");
			System.out.println("등급은 D입니다.");
		}

	}

}

package com.javaex.basic;

public class consoleEx {

	public static void main(String[] args) {
		consoleOutputEx();

	}
	private static void consoleOutputEx() {
		//	표준 출력(stdout) : System.out
		//	표준 에러(stderr) : System.err
		//	메서드 print() -> 출력 후 개행을 하지 않음
		//	메서드 println() -> 출력 후 개행
		//	printf() ->  포멧 출력 -> String 항목에서 정리
		
		System.out.print("Hello ");
		System.out.println("Java");
		System.out.println("New Line");
		
		//	이스케이프 문자
		//	\n(개행), \t(행), \"(따옴표), \\(역슬래시)
		System.out.println("Hello \nJava"); //	강제 개행
		System.out.println("Hello \t\tJava"); //	탭
		System.out.println("Hello \"Java\"");
		
		String filePath = "C:\\myforder\\myfile.txt"; // 역슬래시
		System.out.println(filePath);
	}

}

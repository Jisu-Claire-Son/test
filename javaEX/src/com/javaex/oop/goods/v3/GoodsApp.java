package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		Goods netebook = new Goods("LG Gram", 1500000); //	사용자가 정의 생성자 활용
		Goods smartphone = new Goods("iPhone SE", 650000);
		
		notebook.showInfo();

		System.out.printf("%s, %d원%n", 
				notebook.getName(), notebook.getPrice());
		notebook.showInfo();
		System.out.printf("%s, %d원%n",
				smartphone.getName(), smartphone.getPrice());
		smartphone.showInfo();

	}

}

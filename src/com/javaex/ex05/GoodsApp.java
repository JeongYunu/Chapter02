package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods(); //생성자 호출 --> 디폴트생성자
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		
		
		Goods computer = new Goods("LG그램", 1000000);//게터세터 사용x 생성자에서 다함
		
		computer.showInfo();
		
		
		
		
		
		
		
		
		
		
	}

}

package com.javaex.ex05;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() { //생성자 Goods는 Goods를 메모리(힙)영역에 올리는 역할
		//디폴트생성자는 만들지않아도 내부적으로 만들어져있음.
		//커스텀생성자를 만들면 디폴트생성자도 만들어야함.
	}
	
	public Goods(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	
	
	//메소드 - 게터 세터
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("===========================");
	}

	//메소드-게터 세터 자동 단축키 alt+shift+s -> Generat getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}








}



package com.javaex.ex15;

public class ColorPoint extends Point {

	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
		System.out.println("ColorPoint(2)");
	}

	public String getColor() {
		return color;
	}

	//메소드
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println("x=" + x + ", y=" + y + ", color=" + color);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

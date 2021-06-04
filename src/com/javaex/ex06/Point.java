package com.javaex.ex06;

public class Point {
	//필드
	private int x;
	private int y;

	
	//생성자
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int x) {
		this.x = x;
	}
	
	//자료형이 같으면 같은 생성자가 있다고 판단
	/*
	public Point(int x) {
		this.x = x;
	}
	 */

	//메소드 - 게터세터
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println(x+", "+y);
	}
	
	
	
	
	
	

}

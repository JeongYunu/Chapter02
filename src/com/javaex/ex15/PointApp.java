package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		Point p = new Point(4, 4);
		p.showInfo();
		
		System.out.println("=====================");
		
		/*
		ColorPoint cp1 = new ColorPoint("red");
		cp1.showInfo();
				
		System.out.println("=====================");
		*/
		
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		cp2.showInfo();

		System.out.println("=====================");
	}

}

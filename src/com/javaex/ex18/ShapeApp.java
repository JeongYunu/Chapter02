package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		// 배열을 만든다.
		Shape[] sArray = new Shape[3];

		// 도형을 만든다.
		Shape sr01 = new Rectangle("빨강", "검정", 10, 10);
		Shape sc01 = new Circle("주황", "검정", 30);
		Shape st01 = new Triangle("노랑", "검정", 5, 5);

		// 배열<--도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;

		sr01.draw();
		sc01.draw();
		st01.draw();
		System.out.println("------------------------------------------");

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
			// 오버라이딩이용 구현(부모 클래스에 같은변수의 리턴형 메소드 작성)
			System.out.println("넓이" + sArray[i].area());
		}
		System.out.println("------------------------------------------");

		// 오버라이딩시 생길수있는 부작용(부모의 면적을 못구함-변수이름같을시)
		Shape ss01 = new Shape("검정", "검정");
		System.out.println("Shape 넓이:" + ss01.area());

		// 다운 캐스팅(클래스 시선전환) Shape -> Rectangle
		System.out.println(((Rectangle) sr01).getWidth());

	}
}

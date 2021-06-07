package com.javaex.ex14;

public class Person {
		
		//필드
		protected String name; //접근제어자 가시성 확인
		//private String name;
		protected int age;
		//private int age;
		
		//생성자
		public Person() {
			System.out.println("Person()");
		}
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
			System.out.println("Person(2)");
		}
		
		//메소드
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		
		//데이터 확인용 (alt+shift+s -> Generate toString)
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		
	

}

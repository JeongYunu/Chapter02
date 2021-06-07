package com.javaex.ex12;

public class Person {
	
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	public void showInfo() {
		System.out.println(name + ", " + age);
	}

	
	//데이터 확인용 (alt+shift+s -> Generate toString)
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
	
}

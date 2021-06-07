package com.javaex.ex14;

public class Student extends Person{
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		super();
		System.out.println("Student()");
	}
	
	//부모의 Person(2)생성자 사용
	/*
	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
		System.out.println("Student(2)");
	}
	*/
	
	//부모의 Person()생성자 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name);
		super.setAge(age);
		this.schoolName = schoolName;
		System.out.println("Student(2)");
	}
	
	//메소드 - 게세
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + getName() + ", age=" + getAge() + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 학교: " + schoolName);
	}
	
	
	
	
	
	
	
	
}

package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		Person person = new Person("정우성", 45);
		person.showInfo();
		System.out.println(person.toString());
		
		Student student = new Student("이정재", 45, "한국고등학교");
		System.out.println(student.toString());

	}

}

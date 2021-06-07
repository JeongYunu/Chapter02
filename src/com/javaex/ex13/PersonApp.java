package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {

		Student s01 = new Student();
		s01.setName("정우성");
		s01.setAge(45);
		s01.setSchoolName("서울고등학교");
		
		System.out.println(s01.getName() + ", " + s01.getAge() + ", " + s01.getSchoolName());
		
		
		System.out.println(s01.toString());
		System.out.println("====================");
		
		s01.showInfo();
		
		Person p01 = new Person("이효리", 40);
		p01.toString(); //왜안나오지?
		
		
		
		
		
	}

}

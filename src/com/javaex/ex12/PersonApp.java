package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		//테스트
		Person p = new Person("정우성",45);
		System.out.println(p.toString());
		
		p.setAge(50);
		System.out.println(p.getAge());
		
		
		p.showInfo();
		
		
			Student s00 = new Student("대니" , 30, "면목고등학교");
			System.out.println(s00.toString());
	}

}

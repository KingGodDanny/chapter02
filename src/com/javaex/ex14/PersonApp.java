package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
		//디폴트생성자로 사용
//		Student s01 = new Student();  
//		s01.setName("정우성");
//		s01.setAge(50);
//		s01.setSchoolName("서울고등학교");
//		s01.showInfo();
		
		//student  생성자(3) 사용
		//생성자 순서(부모까지 포함) super 사용!
//		Student s02 = new Student("이효리" , 45, "애월고등학교");
//		s02.showInfo();
		
		//부모의 디폴트 생성자 사용--->확인
//		Student s03 = new Student();
		
		
		Student s04 = new Student("이효리" , 45, "애월고등학교");
		s04.showInfo();
		
		
	}

}

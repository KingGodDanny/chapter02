package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		
		Student s01 = new Student();  //디폴트생성자로 사용
		
		s01.setName("정우성");
		s01.setAge(50);
		s01.setSchoolName("서울고등학교");
		
//		System.out.println(s01.getName());
//		System.out.println(s01.getAge());
//		System.out.println(s01.getSchoolName());
		//Studeun.java에 겟네임과 겟에이지가 없음애도 사용하고 출력할수 있는이유는
		//extends Person을 했기때문에 Person이 부모가 되었고 상속 받아서
		//가능하게된다. 힙구간에 new Student에는 age와 name이 없음을 잘 생각해야한다.
		
		s01.showInfo();
		
		
		//비교해볼것 
		Person p01 = new Person();
		p01.setName("이효리");
		p01.setAge(45);
		p01.showInfo();
	}

}

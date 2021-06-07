package com.javaex.ex14;

	public class Student extends Person {

		//필드-------------------------------------------
		
		private String schoolName;
		
		//생성자------------------------------------------
	
		public Student() {
			super();  //person 부모생성자에 디폴트생성자가 없으면 에러난다.
			System.out.println("Student()");
		}

	  	/* 
	  	//부모의 person(2)짜리 생성자를 사용한것.
		public Student(String name, int age, String schoolName) {
			super(name, age);  //Person.java의 생성자를 사용하는것!
			부모쪽에서 ↑처럼 생성자를 만들어놓지 않을수도있기때문에 상황에 따라서
			사용할줄 알아야함.
			
			this.schoolName = schoolName;
			System.out.println("Student(3)");
		}
		*/
		
		//부모의 Person() 생성자 사용
		public Student(String name, int age, String schoolName) {
			super();
			super.setName(name); //부모의 셋네임, 셋에이지
			this.setAge(age);   
			//정석(super,this): 부모와 자식의 이름이 같을수도있기때문에 super와 this를 써주기!!!
			this.schoolName = schoolName;
			
			
			
			System.out.println("Student(3)");
		}
		
		
		//메소드(게터세터)------------------------------------

		public void setAge(int age) {
			if(age<0) {
				super.age = 0;
			}
		}
		//showInfo 든 setAge든 부모와 자식의 변수명이 같다면 부모거를 안쓰겟다는 의도임.
		//showInfo로 쓰고 파라미터를 boolean on 처럼 다르게 두면 같이쓸수잇다.
		//부모꺼 따로 자식꺼 따로 쓸거면 showInfo, showInfo2로 따로 지정해줘야한다.

		public String getSchoolName() {
			return schoolName;
		}


		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		
		//메소드(일반)----------------------------------------


		@Override
		public String toString() {
			return "Student [schoolName=" + schoolName +  " , age=" + getAge() +"]";
		}
		 //System.out.println(s01.toString()); < 위에 출력사용방법
		//출력하기위에 StudentName처럼 쓰지못하는이유는 Person에 필드에 private으로 잠겨있기때문이다.
		//그래서 겟에이지 겟네임으로 출력해야한다.
		
		
		public void showInfo() {
			System.out.println("================================================");
//			System.out.println("이름: " + name);  <--Person 필드 private떄문사용 불가능 ,그래서 아래처럼 사용해야함
			System.out.println("이름: " + super.name);
			System.out.println("나이: " + age);
			System.out.println("학교: " + schoolName);
			System.out.println("================================================");
		}

}

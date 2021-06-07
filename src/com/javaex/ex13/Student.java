package com.javaex.ex13;

public class Student extends Person {

		//필드-------------------------------------------
		
		private String schoolName;
		
		//생성자------------------------------------------
	
		public Student() {
		
		}

		public Student(String schoolName) {
			
			this.schoolName = schoolName;
		}
		
		//메소드(게터세터)------------------------------------




		public String getSchoolName() {
			return schoolName;
		}


		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		
		//메소드(일반)----------------------------------------


		@Override
		public String toString() {
			return "Studunt [schoolName=" + schoolName +  " , age=" + getAge() +"]";
		}
		 //System.out.println(s01.toString()); < 위에 출력사용방법
		//출력하기위에 StudentName처럼 쓰지못하는이유는 Person에 필드에 private으로 잠겨있기때문이다.
		//그래서 겟에이지 겟네임으로 출력해야한다.
		
		
		public void showInfo() {
			System.out.println("================================================");
//			System.out.println("이름: " + name);  <--Person 필드 private떄문사용 불가능 ,그래서 아래처럼 사용해야함
			System.out.println("이름: " + getName());
			System.out.println("나이: " + getAge());
			System.out.println("학교: " + schoolName);
			System.out.println("================================================");
		}

		
	
}

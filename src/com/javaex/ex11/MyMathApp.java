package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
	
		
		/* 메소드일반에서 오버로딩한걸 쓰는 케이스
		MyMath myMath = new MyMath();

		System.out.println(myMath.plus(100, 100));
		
		System.out.println(myMath.plus(100.5, 100.2));
		
		System.out.println(myMath.plus(100.2, 100));
		
		System.out.println(myMath.plus(99, 34.5));
		*/
		
		
		
		
		//스태틱에 올려놓은것을 공용으로 쓴것
		//스태틱 사용법은 메소드(일반)에 public static 자료형 변수명() 해놓고
		//클래스명.변수명(자료형값,자료형값)
		
		System.out.println(MyMath.plus(99, 99));
		System.out.println(MyMath.plus(10.1, 12.4));
		System.out.println(MyMath.plus(99, 99.4));
		System.out.println(MyMath.plus(99.7, 34));
		
		/*
		MyMath myMath = new MyMath(); // 이렇게 쓸 이유가 없다
		System.out.println(myMath.plus(100, 100));
		*/
		
		
		
	}

}

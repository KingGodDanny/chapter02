package com.javaex.ex21;

public class Ex01 {

	public static void main(String[] args) {
		//예외처리 - NullPointerException
		
		
		Rectangle r01 = new Rectangle("빨강" , "검정" , 5 ,5);
		
		
		r01 = null;   //null 주소가없는것!
		
		try {
			r01.draw();
			
		} catch (NullPointerException e) { 
			//부모인 클래스에는 기본적으로 Exception가 있는것이고
			//자식들에는 특수한 경우들이 있기때문에 아리스메틱이나 널포인트메틱이나
			//따로 써주는 경우들이 있다. 그 이유는 부모의 Exception을 끌어다 쓰다보면
			//자식에서 특정Exception을 발견하지 못할수도 있다.
			//사용법을 먼저 익히는것이 중요포인트!!!!!!!!!!!!
			
			System.out.println(e.getMessage());
			
//			r01 = new Rectangle("검정" , "검정" , 5000 ,5000);
//			r01.draw();
		}
		
		
		//보통은 Exception error = new Exception을 메모리에 올리지만
		//그 역할을 try~catch문이 직접해줌 문제가 있으면 메모리에 올리고 
		//아니면 올리지않음.
	}

}

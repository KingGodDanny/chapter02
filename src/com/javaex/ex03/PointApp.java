package com.javaex.ex03;

public class PointApp {
	//필드
	

	
	//생성자
	
	
	//메소드(게터/세터)
	
//-------------------------------위에는 지금 필요없어서 사용하지않는것이다.	
	
	//메소드(일반)안쪽은 위에서부터 아래로 작동한다.
	
	public static void main(String[] args) {
		
		Point firstPoint = new Point();		
		firstPoint.setX(5);
		firstPoint.setY(5);
		
		
		Point secondPoint = new Point();
		secondPoint.setX(10);
		secondPoint.setY(23);
		
		
		
		firstPoint.draw();
		secondPoint.draw();
	}

}

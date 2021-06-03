package com.javaex.ex06;

public class Point {

		//--------------------------필드작성
		private int x;        //추상화 & 필드
		private int y;		  //추상화 & 필드
		
		
		//---------------------생성자
		
		public Point() {
			
		}
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Point(int x) {     //파라미터안에 자료형이 같으면 같은걸로 구별을해서 사용해야함.
			//이 생성자를 힙에 올리는것.
			this.x = x;
		}
		
//		public Point(int y) {   //파라미터안에 자료형이 같으면 같은걸로 구별을해서 사용해야함.
//			this.y = y;			//결정해서 사용해야함
//		}						// 두가지의 생성자에 파라미터안에 자료형 순서가 다르면 사용가능함.
		//---------------------메소드 셋터
		
		public void setX(int x) {
			this.x = x;  
		}
		
		public void setY(int y) {
			this.y = y; 
		}
		
		//----------------------메소드 겟터
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		//---------------------draw 메소드 일반
		public void draw() {
			//그리는 복잡한 기능을 구현해야한다고 가정..
			System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
		}
}

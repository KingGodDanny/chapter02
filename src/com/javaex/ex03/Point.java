package com.javaex.ex03;

public class Point {

	//필드작성
	private int x;        //추상화 & 필드
	private int y;		  //추상화 & 필드
	
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


/*
  public안에는 순서대로 가지만 이 위에는 그냥 널부러져잇는것이다.
  필드와 생성자 메소드 등등 
  if같은건 메소드 안에서 움직이는거지 위에서 사용할수없다.
 */

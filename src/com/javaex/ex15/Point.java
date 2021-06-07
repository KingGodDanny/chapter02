package com.javaex.ex15;

public class Point {

	//필드-----------------------------------------
	
//	protected int x;
//	protected int y;
	private int x;
	private int y;
	
	//생성자-----------------------------------------
	
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	//메소드(게터세터)--------------------------------------
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드(일반) -----------------------------------

	
	public void showInfo() { //화면출력용이고 꾸미는건 만들기 힘들고 오래걸린다.
		System.out.println("===================================");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("===================================");
	}
	

	
	
	
}

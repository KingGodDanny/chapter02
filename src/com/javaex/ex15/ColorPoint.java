package com.javaex.ex15;

public class ColorPoint extends Point {

	//필드----------------------------------
	
	private String color;

	
	//생성자---------------------------------
	
	public ColorPoint() {
		super();
	}

	

	public ColorPoint(String color) {
		super();
		this.color = color;
	}



	public ColorPoint(int x, int y, String color) {
		//super(x, y);
		super.setX(x);
		super.setY(y);
		this.color = color;
	}

	
	
	//메소드(게터세터)------------------------------

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	//메소드(일반)
	
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}

	public void showInfo01() {
		System.out.println("컬러: " + color);
	}

	public void showInfo() { //화면출력용이고 꾸미는건 만들기 힘들고 오래걸린다.
		System.out.println("===================================");
		System.out.println("x: " + super.getX());
		System.out.println("y: " + super.getY());
		System.out.println("컬러: " + color);
		System.out.println("===================================");
	}
	
//	System.out.println("x: " + super.x);
//	System.out.println("y: " + super.y);
	
	
	
	
}

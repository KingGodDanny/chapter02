package com.javaex.ex17;

public class Rectangle extends Shape {

	// 필드-------------------------------------------------------

	private int width;
	private int height;

	// 생성자-----------------------------------------------------

	public Rectangle() {
		// super(); // Shape() --> super()
		System.out.println("Rectangel()");
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {

//		super.setFillColor(fillColor);
//		super.setLineColor(lineColor);

		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Rectangle(4)");
	}

	// 메소드(게터세터)--------------------------------------------

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드(일반)------------------------------------------------

	@Override // 부모의 필드가 protected로 열려있기때문에 getfillColor() 처럼 투스트링을 만들지않는다. 코딩 다름 확인하기!
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

	public void draw() {
		System.out.println(
				"[면색: " + fillColor + ", 선색: " + lineColor + ", 가로: " + width + ", 세로: " + height + "] 사각형을 그렸습니다.");
	}

	//메소드 draw처럼 부모와 자식에 이름이 동일한 경우를 --재정의--라고 하고 자식거를 먼저쓴다!
	
	
}

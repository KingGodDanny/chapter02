package com.javaex.ex17;

public class Circle extends Shape {

	// 필드-----------------------------------------------------

	private int radius;

	// 상속자---------------------------------------------------
   
	public Circle() {
		super();
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
		System.out.println("radius(3)");
	}

	// 메소드(게터세터)-----------------------------------------

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드(일반)----------------------------------------------

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	/*
	 * 부모의 필드가 private으로 되있을경우 사용해야하는 toString 방식이다.------------------------------
	 * 
	 * @Override public String toString() { return "Circle [radius=" + radius +
	 * ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor() +
	 * "]"; }
	 */

	public void draw() {
		System.out.println(
				"[면색: " + fillColor + ", 선색: " + lineColor + ", 반지름:" + radius + "] 원을 그렸습니다.");
	}

}

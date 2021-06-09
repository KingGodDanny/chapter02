package com.javaex.ex19;

public abstract class Shape {   //부모상속자이기때문에 자식을 고려해서 고칠것이 없다.

	// 필드-------------------------------------------------------------
	protected String fillColor;
	protected String lineColor;

	// 생성자-----------------------------------------------------------
   
	public Shape() {
		//super();
		System.out.println("Shape()");
	}

	public Shape(String fillColor, String lineColor) {

		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("Shape(2)");
	}

	// 메소드(게터세터)--------------------------------------------------

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// 메소드(일반)------------------------------------------------------

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	

	public void draw() {
		System.out.println("[면색: " + fillColor + ", 선색: " + lineColor + "] 도형을 그렸습니다.");
	}
	
	public abstract double area();
	//오버라이드를 위해서 쓰는 return값이 없는 위처럼 형식은
	//메인클래스에 부모가 부모의 생성자를 쓰는것처럼 Shape.area()는 아예 쓸수없다.
	//자식들의 값들을 출력해주기위함.
	
	
	
}

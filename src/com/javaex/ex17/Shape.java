package com.javaex.ex17;

public class Shape {   //부모상속자이기때문에 자식을 고려해서 고칠것이 없다.

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

	

	public void draw() {
		System.out.println("[dsa면색: " + fillColor + ", 선색: " + lineColor + "] 도형을 그렸습니다.");
	}

}

package com.javaex.ex18;

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

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	

	public void draw() {
		System.out.println("[면색: " + fillColor + ", 선색: " + lineColor + "] 도형을 그렸습니다.");
	}
	
	public double area() {
		return 0.0;  
	}
	//첨부터 설계할때 넓이까지 출력하게끔 계획이 세워져있었고, 부모에 같은 .area가 있어야
	//오버라이딩해서 자식들의 값들을 출력할수 있기때문에 (부모)Shape에 .area를 생성해주고
	//return값을 줘야하기때문에 double로 잡아놓은 0.0을 써준다.
	//이렇게 써줘도 자식들의 area가 오버라이딩 되기때문에 덮어 쓰여진다.
	
	
}

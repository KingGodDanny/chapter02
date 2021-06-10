package com.javaex.ex19;

import com.javaex.ex20.Drawable;

public class Triangle extends Shape implements Drawable {
	
	//필드---------------------------------------------
	
	private int width;
	private int height;
	
	
	//생성자-------------------------------------------
	
	public Triangle() {
		super();
	}
  

	public Triangle(String fillColor, String lineColor, int width, int height) {

		//super.setFillColor(fillColor);  상황에 따라서 이렇게 쓰는 상황도 생각해야한다.
		//super.setLineColor(lineColor);
		
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Triangle(2)");
	}

	
	//메소드(게터세터)----------------------------------
	
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


	//메소드(일반)--------------------------------------

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	
	
	public void draw() {    //public interface Drawable때문에 쓰는것!
		System.out.println(
				"[면색: " + fillColor + ", 선색: " + lineColor + ", 가로: " + width + ", 세로: " + height + "] 삼각형을 그렸습니다.");
	}
	
	//추상클래스를 상속하면 추상메소드를 구현해야한다.
	public double area() {   //부모인 public abstract class Shape 때문에 쓰는것!
		return (width*height)/2;
	}
	
	
	
}

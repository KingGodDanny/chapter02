package com.javaex.ex01;

public class GoodsApp {
		//필드
		private static String name;
		
		//생성자
		
		//메소드 g/s
		
		//메소드 일반
	
	
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		System.out.println(camera.name + "," + camera.price);
		
		
		
		Goods computer = new Goods();
		computer.name = "그램";
		computer.price = 1000000;
		System.out.println(computer.name + "," + computer.price);

		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		System.out.println(cup.name + "," + cup.price);
		
		
		System.out.println(name);
		
		System.out.println(cirleArea(10));
		
	
	}
	
	public static double cirleArea(int radius) {
		double result = radius*radius*3.14;
		return result;
	}


}

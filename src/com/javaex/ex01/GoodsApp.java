package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		camera.name = "니콘";
		camera.price = 400000;
		System.out.println(camera.name +":"+camera.price);
		
		
		Goods computer = new Goods();
		
		computer.name = "LG그램";
		computer.price = 1000000;
		System.out.println(computer.name +":"+computer.price);
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 20000;
		System.out.println(cup.name +":"+cup.price);
		
	}

}

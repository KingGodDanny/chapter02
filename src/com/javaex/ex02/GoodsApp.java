package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		//camera.name = "니콘";
		camera.setName("니콘");
		
		
		//camera.price = 400000;
		camera.setPrice(-400000); 
		
		System.out.println(camera.getPrice());
		
		//computer.name = "LG그램";
		computer.setName("LG그램");

		
		//computer.price = 1000000;
		computer.setPrice(1000000);
		
		
		//cup.name = "머그컵";
		cup.setName("머그컵");
		
		cup.setPrice(2000);
		//cup.price = 2000;
		
//		System.out.println("상품명: " + camera.name + " , " + "가격: " + camera.price);
//		System.out.println("상품명: " + camera.getName() + " , " + "가격: " + camera.getPrice());
//      String cameraName = camera.getName();           //바로 리턴해서 내보내지않고
//		System.out.println("상품명: " + cameraName());  //변수에 담아놓을수도있다.그리고 출력가능.
		
		camera.showInfo();
		

//		System.out.println("상품명: " + computer.name + " , " + "가격: " + computer.price);
//		System.out.println("상품명: " + computer.getName() + " , " + "가격: " + computer.getPrice());
		
		computer.showInfo();

//		System.out.println("상품명: " + cup.name + " , " + "가격: " + cup.price);
//		System.out.println("상품명: " + cup.getName() + " , " + "가격: " + cup.getPrice());
		
		cup.showInfo();
		
	}

	
	
	
}

package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
	/*	
		Goods camera = new Goods(); //new 뒤에 Goods는 생성자로 두는것 -생성자 호출

		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		//위에같은 코드를 못쓰게 만들거면 Goods.java에서 public Goods() {} 디폴트생성자를
		//없애주면 사용불가함!!!
		
		//생성자는 1번만 사용할수있다 >>말의 의미 꼭 이해하고 체크할것
		//camera.Goods("니콘2", 500000);
		
		Goods computer = new Goods("그램" , 1000000);
		computer.showInfo();

	*/
	
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		/*
		camera.setName("니콘2"); 
		camera.showInfo();
		*/
		//----------------------------------------
		
		Goods camera02 = new Goods("니콘" , 500000);
			  camera02 = new Goods("플로" , 300000);
		Goods camera03 = new Goods("소니" , 400000);
		camera02.showInfo();
		camera03.showInfo();
		
		
		
	}
}

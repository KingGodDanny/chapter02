package com.javaex.ex09;

public class GoodsApp {

	//static 관련업무  ---> 스태틱은 잘 사라지지않는다
	//count 용도로 static 잘사용하지않는다 --> 현재수업에선 배열사용할것임 
	//그다음은 리스트라는걸 사용할거임
	public static void main(String[] args) {
		
	
		
		Goods computer = new Goods("Gram" , 1000000);

		computer.showInfo();
		

		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		
		
		Goods cup = new Goods("머그컵" , 2000);
		
		cup.showInfo();
		
		
	}

}

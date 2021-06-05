package com.javaex.ex10;

public class GoodsApp {
    

	//static 관련업무  ---> 스태틱은 잘 사라지지않는다
	//count 용도로 static 잘사용하지않는다 --> 현재수업에선 배열사용할것임(하지만 한계가잇음)
	//그래서 나중에는 리스트라는걸 사용할거임	
	
	
	public static void main(String[] args) {
		
		//int [] intArray = new int[3]  배열 원래 형식임!!!!잘 기억해야함
		
		
		Goods[] goodsArray = new Goods[3];
		//주소를 따라가보면 Goods라는곳이 있고 new에 담을것이다.
		
		System.out.println(goodsArray.length);
		
		
		Goods computer = new Goods("Gram" , 1000000);
		Goods camera = new  Goods("Nikon" , 400000);
		
		/*
		computer.showInfo();
		camera.showInfo();
		*/
		
		
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		
		
		System.out.println(computer.getName());
		//위아래 같은 출력방법
		System.out.println(goodsArray[0].getName());
		
		int count = 0;    //얘의 목숨은 위에서 2번째 아래에서 2번째괄호안까지다.
		
		for(int i=0; i<goodsArray.length; i++) {
			if(goodsArray[i] != null) {	//배열에 주소가 없지않으면 -->주소가 있다면 카운트출력!
				count = count + 1;
				goodsArray[i].showInfo();
			}
		}
		
		System.out.println(count);
		
		
	}

}

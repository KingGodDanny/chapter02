package com.javaex.ex05;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자  --내가 코드를 굳이 안만들어도 알아서 만들어줌. 
	//Goods파일을 부르는게아니고 이 생성자를 부르는거임 GoodsApp에서 new를 통해!!!
	public Goods() {
		//Goods 메모리(힙)에 올리는것!
	}   //만약 이 default생성자를 없앨경우 GoodsApp에서 만든 Goods camera = new Goods();를
		//사용할수없음 ->밑에처럼 다른생성자를 만들경우 이걸안써줄경우 사라지기때문에 써줘야함!
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	/*
	 * 같은 생성자이름(Goods)를 쓰는것같지만 ()의 파라미터값이 다르기때문에 결국 다른것이다
	 * 오버로딩 > 그냥 로딩됏다고 생각하면 됌 
	 */
	
	
	//메소드 게터세터
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("==========================");
	}
	
	
	
	
}

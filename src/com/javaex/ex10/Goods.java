package com.javaex.ex10;

public class Goods {
     
	//필드-------------------------------------------------------------
	private String name;  
	private int price;
		
	
	//생성자-----------------------------------------------------------
	
	public Goods() {

	}
	
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	//메소드(게터세터)----------------------------------------------------

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
	
	


	
	//메소드-일반-------------------------------------------
	
		public void showInfo() {
			System.out.println("상품가격: " + name);
			System.out.println("가격 : " + price);
			System.out.println("===============================");
		}
		
		
		
}

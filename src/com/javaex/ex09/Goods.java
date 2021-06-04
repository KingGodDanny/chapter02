package com.javaex.ex09;

public class Goods {

	//필드------------------------------------------------------------------------------
	private String name;   // private =>정보의 은닉화
	private int price;
	private static int count;
	
	
	//생성자 <<메모리에 생성자가 올라가서 코드들을 올려주고 사라진다.----------------
	
	
	public Goods() {
		count = count + 1;
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		count = count + 1;
	}
	
	
	
	//메소드-겟터세터--------------------------------------------------------------------
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(String name) {
		return name;
	}
		
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		
		
		if(price>0) {
			this.price = price;
		} else {
			this.price = 0;
			
			//int sale = 0;  
			//이런 변수는 필드에 생성할수없고 바로 아래 괄호가 끝날때 사라진다
			//그래서 사용위치를 잘 파악해야한다. 주머니에 맨마지막에 넣은
			//물건을 먼저 꺼내듯 변수가 괄호안에서 맨마지막에 꺼부터 사라진다
		}
		
	}
	

	
	
	//메소드-일반--------------------------------------------------------------------
	
	public void showInfo() {
		System.out.println("상품가격: " + name);
		System.out.println("가격 : " + price);
		System.out.println("카운트 : " + count);
		System.out.println("===============================");
	}

	
	
}

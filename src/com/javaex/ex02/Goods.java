package com.javaex.ex02;

public class Goods {

	//필드
	private String name;   // private =>정보의 은닉화
	private int price;
	
	//생성자
	
	
	//메소드-겟터세터
	
	
	public void setName(String name) {
		this.name = name;     //리턴값이 없는 형태
	}
		
	public String getName() {      	//내보내는거라 겟네임()안에 넣어줄것이없다
		return name; 
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		if(this.price<0) {
			return 0;
		} else {
			return price;
		}
	}
			
	
	
	//메소드-일반
	
	public void showInfo() {
		System.out.println("상품가격: " + name);
		System.out.println("가격 : " + price);
		System.out.println("--------------------");
	}
		
		
	
	
	
	
	
}

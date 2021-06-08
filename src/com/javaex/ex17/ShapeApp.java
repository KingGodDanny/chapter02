package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		
		//부모클래스 테스트  - 사각형테스트
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		s01.draw();
		
		/*
		//상속된자식클래스 테스트 - 사각형테스트
		Rectangle r01 = new Rectangle("빨강", "검정" , 3 , 3); //생성자 순서 Shape(2) -> Rectangle(4)	
		System.out.println(r01.toString());		
		r01.draw();
		*/
		
		//사각형 관리
		//배열만들기
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형 만들기
		Rectangle r01 = new Rectangle("빨강", "검정" , 3 , 3);
		Rectangle r02 = new Rectangle("주황", "검정" , 4 , 4);
		Rectangle r03 = new Rectangle("노랑", "검정" , 5 , 5);
		
		//배열 안에 사각형 넣기
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//배열을 통해서 그리기(출력하기)
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑사각형↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
		
		
		//부모클래스 테스트  - 원테스트
		Shape s02 = new Shape("퍼플" , "검정");
		s02.draw();
		
		
		//상속된자식클래스 테스트 - 원테스트
		
//		Circle c01 = new Circle("네이비" , "검정" , 17);
//		System.out.println(c01.toString());
//		c01.draw();
		
		
		//원 관리
		//배열만들기
		Circle[] cArray = new Circle[3];
		
		
		//원 만들기
		
		Circle c01 = new Circle("퍼플" , "검정" , 17);
		Circle c02 = new Circle("블루" , "검정" , 27);
		Circle c03 = new Circle("살구" , "검정" , 30);
		
		//배열 안에 원 넣기
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//변수를 만들어 원을 만들지않고 바로 배열에 원을 담는 방법!!
		//cArray[0] = new Circle("퍼플" , "검정" , 17);
		//cArray[1] = new Circle("블루" , "검정" , 27);
		//cArray[2] = new Circle("살구" , "검정" , 30);
		
		
		//배열을 통해서 그리기(출력하기)
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑원↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
		
		
		//부모클래스 테스트  - 삼각형 테스트
		
		Shape s03 = new Shape();   //디폴트 생성자 사용했기때문에 Shape() 출력된다.
		s03.draw();
		
		
		//상속된자식클래스 테스트 - 삼각형 테스트
		
		Triangle t00 = new Triangle("남색" , "검정" , 123 , 321);
		System.out.println(t00.toString());
		t00.draw();
		
				
		//삼각형 관리
		//배열만들기
		
		Triangle[] tArray = new Triangle[3];
		
		//변수안에 삼각형 담지말고 바로
		//배열 안에 삼각형 넣기
		
		tArray[0] = new Triangle("핑크" , "검정" , 333 , 777);
		tArray[1] = new Triangle("그레이" , "검정" , 12 , 46);
		tArray[2] = new Triangle("그린" , "검정" , 4322 , 4124);
		
		
		//배열을 통해서 그리기(출력하기)
		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
	
		System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑삼각형↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
	}

}

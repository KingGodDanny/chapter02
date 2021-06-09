package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		//배열을 만든다.
		Shape[] sArray = new  Shape[3];
		
		
		//도형을 만든다.
		Shape sr01 = new Rectangle("레드" , "검정" ,10, 10);
		Shape sc01 = new Circle("블루", "검정" , 20);
		Shape st01 = new Triangle("옐로우", "검정", 30, 30);
		
		
		
		
		//배열 <-- 렉탱글 써클 트라이앵글이라는 도형을 넣는다.
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;
		
		System.out.println(sr01.toString());
		sr01.draw(); 
		//Shape 의 .draw가 뜨지만 실행해보면 Rectangle의 .draw가 실행된다(오버라이딩)
		//부모자식간이여야하고 Shape sr01 = new Rectangle처럼 섞어썼을때 
		//자식이 부모한테 올라탄다는 개념이다. 막상 Shape의 .draw가 뜨지만 자식의 .draw가
		//덮어쓰기되는것이다.
		
		//배열을 이용해서 그리기
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();  
			
			
			//오버라이딩을 이용해서 구현할수 있다.
			System.out.println("넓이: " + sArray[i].area());
		}
		
		//문제점임! 부모의 오버라이딩을 이용하면 자식들을 출력할수있는 장점이있는데
		//이런 문제점이 발생함. 부모의 Shape넓이까지도 return값 0.0이 나와버림!
		Shape ss01 = new Shape("블랙", "블랙");
		System.out.println("Shape 넓이: " + ss01.area());
		
		
		//다운캐스팅
		//Rectangle sr01 = new Rectangle("레드" , "검정" ,10, 10);
		System.out.println(((Rectangle)sr01).getWidth()); 
		//시선이 Shape가 있는 sr01을 강제형변환으로 사용하는것!!!
		
		
		 //.draw가 Shape꺼로 뜨지만 자식들이 오버라이딩해서 각각의 .draw가 출력된다.
		
		/*
		 * //도형(Shape)의 배열을 만든다. Shape[] sArray = new Shape[3];
		 * 
		 * //도형만들기 Shape r01 = new Rectangle("레드" , "검정" ,10, 10); Shape c01 = new
		 * Circle("블루", "검정" , 20); Shape t01 = new Triangle("옐로우", "검정", 30, 30); //새롭게
		 * 복제된 렉탱글, 써클, 트라이앵글의 주소를 따라가다보면 Shape라는 주소가있다.
		 * 
		 * //Shape 배열<<<사각형 Shape[0] = r01; //이방법은 안된다.
		 * 
		 * //Shape 배열<<<원 sArray[1] = c01;
		 * 
		 * //Shape 배열<<<삼각형 sArray[2] = t01;
		 * 
		 * for(int i=0; i<sArray.length; i++) { sArray[i].draw(); }
		 */
	}

}

//시선은 분명히 Shape를 쓰고있지만 자식들이 겹치는 .draw나 toString을 덮어쓰기(오버라이딩) 하고있는것이다.
//자식도 겟이나 세트를 포기하고 쓰는 것이다. 
//Shape sr01 = new Rectangle처럼 섞어썼다면 오버라이딩이라고 생각해봐야한다.

//***오버라이딩과 오버로딩의 차이점을 분명히 알아야함!!!!

//실무에서 남이 짜놓은 소스를 받았을때 이것은 오버라이딩 했구나라고 판단할수 있어야하고
//부모와 자식에 이름이 같은 메소드가 있다면 그것은 오버라이딩했다고 생각해야하고
//그림을 그려서 판단하는것이 제일 중요하다.
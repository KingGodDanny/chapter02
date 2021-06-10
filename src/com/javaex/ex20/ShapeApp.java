package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Point p01 = new Point(5, 5);
		p01.draw();
		
		
		Drawable dp01 = new Point(10, 10);
		dp01.draw();
		*/
		
		
		//배열(Drawable[])을 만든다
		Drawable[] dArray = new Drawable[4];
		
		
		//사각형을 만든다
		Drawable r01 = new Rectangle("빨강", "검정", 7, 7); 
		//******인터페이스Drawable의 draw()만 쓸수잇다. ********
		//******get에 관련된 필드도 하나도 보이지않는다. 그이유는 시선이 Drawable로 가있기 떄문!
		
		//원을 만든다
		Drawable c01 = new Circle("주황", "살구", 55);
		
		
		//삼각형을 만든다
		Drawable t01 = new Triangle("주황", "살구", 365, 365);
		
		
		//점을 만든다
		Drawable p01 = new Point(100, 155);
		
		
		
		//배열<----도형을 넣는다(사격형, 원 ,삼각형, 점)
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		//배열을 이용해서 그린다(출력한다).
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 면적 출력
		System.out.println(((Rectangle)r01).area());
		System.out.println(((Shape)r01).area());
		
		
		//배열을 이용해서 면적을 출력한다.
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			} 
		}
		
		
		
	}

}


package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		//사각형관리-----------------------------------------------------
		Rectangle[] rArray = new Rectangle[3];
		
		
		Rectangle r01 = new Rectangle("빨강" , "검정" , 5 , 5);
		Rectangle r02 = new Rectangle("노랑" , "검정" , 6 , 6);
		Rectangle r03 = new Rectangle("초록" , "검정" , 7 , 7);
		
		rArray[0] = r01; //r01에 rArray의 0번째방에 담아라.
		rArray[1] = r02;
		rArray[2] = r03;
		
		
		//배열을 이용한 출력------------------------------------------------
		for(int i=0; i<rArray.length; i++ ) {
			rArray[i].draw();   //배열로 담은 속성들 출력방법.
		}
		
		
		System.out.println("");
		//원관리------------------------------------------------------------
		//변수사용해서 그리기
		
		Circle c01 = new Circle("자주" , "검정" , 13);
		Circle c02 = new Circle("주황" , "검정" , 20);
		Circle c03 = new Circle("살구" , "검정" , 27);
		
		
		//toString을 이용한 출력방법-----------------------------------------
		System.out.println("===========toString  출력=============================================================");
		System.out.println(c01.toString());
		System.out.println(c02.toString());
		System.out.println(c03.toString());
		System.out.println("");
		
		//변수, draw메소드를 이용한 출력방법--------------------------------
		System.out.println("============변수, draw메소드 출력============================================================");
		c01.draw();
		c02.draw();
		c03.draw();
		
		System.out.println("");
		
		//배열에 담기--------------------------------------------------------
		System.out.println("===================배열출력=====================================================");
		
		Circle[] cArray = new Circle[3];
		
		cArray[0] = c01;		
		cArray[1] = c02;
		cArray[2] = c03;
		
		//cArray[0] = new Circle("자주" , "검정" , 13); 변수방안만들고 바로 배열방에 담는방법
		//cArray[1] = new Circle("주황" , "검정" , 20);
		//cArray[2] = new Circle("살구" , "검정" , 27);
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		System.out.println("");
		System.out.println("===================배열(if)출력=====================================================");
		
		for(int i=0; i<cArray.length; i++) {
			if(i==2) {
				cArray[i].setFillColor("화이트");
				
			}
			cArray[i].draw();
		}
		System.out.println("");
		
		
		/////////////////////////////////////////////////////////////////
		
		System.out.println("=======================사각형 배열이용 변경 출력=================================================");
		//변수를 이용한 면색 변경--------------------------------------------
//		r01.setFillColor("파랑");
//		r02.setFillColor("파랑");
//		r03.setFillColor("파랑");  //이렇게 바꾸는것은 비효율적인 방법임.
		
		
		//배열을 이용한 면색 변경--------------------------------------------
		for(int i=0; i<rArray.length; i++) {
			rArray[i].setFillColor("파랑");   // 이렇게 한번에 다바꿀수있다.
		}

		//배열로 변경한 속성값들 출력방법.
		for(int i=0; i<rArray.length; i++ ) {
			rArray[i].draw();   //배열로 담은 속성들 출력방법.
		}
		
		
		
		/*
		r01.draw(); //생성자이용을 통한 출력방법
		r02.draw();
		r03.draw();
		*/
		
		
		
	
	}

}

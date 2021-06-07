package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(4,4);
		p.showInfo(); 
		//이렇게 부모상속자인데 showInfo로 출력할수있는이유는
		//상속자인 Point의 공간에 있는 showInfo를 썻기때문이다.
		
		
		
		ColorPoint cp1 = new ColorPoint("red");
		System.out.println(cp1.toString());    //toString으로 간단한 출력방법
		cp1.showInfo01();					   //showInfo를 통한 출력방법
		
		
		
		//부모인 Point 상속자를 ColorPoint에서 super를 사용하여 출력한것
		/*
		현재 부모인 Point의 필드가 private로 묶여있기때문에
		showInfo에서 그냥 시스아웃(x & y)로 쓸수없다. 그래서 getX,Y로 둬야하고
		그냥 X & Y로 쓰고싶은경우에는 부모의 필드를 public이나 protected로 줘야지
		같은 패키지안에서 자식클래스가 자유롭게 쓸수있다. (public은 비추->마음대로 값들을 수정하면안될경우)
		 */
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		cp2.showInfo(); 
		//  ↑↑↑↑↑ 부모와 자식 클래스의 동일한 showInfo가 있음에도 마우스를 올렸을때
		// ColorPoint가 뜨는 이유는 이름을 동일하게 했고 출력해야할 값이 겹치거나 동일할경우에
		//자식의 쇼인포를 출력해주기때문이다. 변수명을 같게하고 둘다 출력하게하고싶다면 그 안에 파라미터를
		//하나는 boolean on같은걸로 넣어줘서 기능을 다르게 사용하면된다.

		
	}

}
